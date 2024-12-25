package lab8;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Message> {
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public void init(EndpointConfig config) {
	}

	@Override
	public String encode(Message message) throws EncodeException {
		try {
			return mapper.writeValueAsString(message);
		} catch (Exception e) {
			throw new EncodeException(message, "Encoding failed", e);
		}
	}

	@Override
	public void destroy() {
	}
}
