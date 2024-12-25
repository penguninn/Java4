package lab8;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.websocket.DecodeException;
import jakarta.websocket.Decoder;
import jakarta.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Message> {
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public void init(EndpointConfig config) {
	}

	@Override
	public Message decode(String s) throws DecodeException {
		try {
			return mapper.readValue(s, Message.class);
		} catch (Exception e) {
			throw new DecodeException(s, "Decoding failed", e);
		}
	}

	@Override
	public boolean willDecode(String s) {
		return s.contains("text") && s.contains("type");
	}

	@Override
	public void destroy() {
	}
}
