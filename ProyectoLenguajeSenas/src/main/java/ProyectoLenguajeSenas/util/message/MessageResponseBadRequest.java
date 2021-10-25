package ProyectoLenguajeSenas.util.message;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.util.enums.TypeMessage;

public class MessageResponseBadRequest extends MessageResponse {

	public MessageResponseBadRequest() {
	}

	public MessageResponseBadRequest(String _message) {
		super(ResponseEntity.badRequest().build().getStatusCodeValue(), TypeMessage.BAD_REQUEST, _message);
	}

}
