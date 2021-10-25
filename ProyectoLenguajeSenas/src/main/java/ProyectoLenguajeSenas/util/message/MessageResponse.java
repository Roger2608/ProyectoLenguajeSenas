package ProyectoLenguajeSenas.util.message;

import ProyectoLenguajeSenas.util.enums.TypeMessage;

public abstract class MessageResponse {

	/*
	 * Code of query to api
	 */
	private int _code;
	/*
	 * Type of message to return
	 */
	private TypeMessage _type;
	/*
	 * Message to return
	 */
	private String _message;

	public MessageResponse() {
	}

	public MessageResponse(int _code, TypeMessage _type, String _message) {
		this._code = _code;
		this._type = _type;
		this._message = _message;
	}

	public int get_code() {
		return _code;
	}

	public void set_code(int _code) {
		this._code = _code;
	}

	public TypeMessage get_type() {
		return _type;
	}

	public void set_type(TypeMessage _type) {
		this._type = _type;
	}

	public String get_message() {
		return _message;
	}

	public void set_message(String _message) {
		this._message = _message;
	}

}
