package lab8;

import java.util.HashMap;
import java.util.Map;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/json/chat/{username}", encoders = MessageEncoder.class, decoders = MessageDecoder.class)
public class JsonChatServerEndpoint {
	private static Map<String, Session> sessions = new HashMap<>();

	private void broadcast(Message message) {
		sessions.values().forEach(session -> {
			try {
				session.getBasicRemote().sendObject(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	@OnOpen
	public void onOpen(@PathParam("username") String username, Session session) {
		if (sessions.containsKey(username)) {
			throw new RuntimeException("Username already exists!");
		}
		sessions.put(username, session);
		this.broadcast(new Message("joined the chat", 0, username, sessions.size()));
	}

	@OnMessage
	public void onMessage(Message message, Session session) {
		this.broadcast(message);
	}

	@OnClose
	public void onClose(Session session) {
		String username = (String) session.getUserProperties().get("username");
		sessions.remove(username);
		this.broadcast(new Message("left the chat", 1, username, sessions.size()));
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		try {
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
