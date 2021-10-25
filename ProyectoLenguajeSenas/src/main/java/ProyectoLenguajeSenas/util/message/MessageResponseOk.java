package ProyectoLenguajeSenas.util.message;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.util.enums.TypeMessage;

public class MessageResponseOk extends MessageResponse{
	
	public MessageResponseOk() {
		super();
	}

	public MessageResponseOk(String _message) {
		super(ResponseEntity.ok().build().getStatusCodeValue(), TypeMessage.OK, _message);
	}

	@Override
	public String toString() {
		return "MessageResponseOk [get_code()=" + get_code() + ", get_type()=" + get_type() + ", get_message()="
				+ get_message() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
