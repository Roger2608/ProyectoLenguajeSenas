package ProyectoLenguajeSenas.logic.generic;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;
import ProyectoLenguajeSenas.util.message.MessageResponse;

public interface AbstractControllerInterface<T extends LenguaSordo> {

	public abstract ResponseEntity<List<T>> mostrarTodos();
	
	public abstract ResponseEntity<MessageResponse> guardar(T t);
	
	public abstract ResponseEntity<MessageResponse> update(T t);
	
	public abstract ResponseEntity<MessageResponse> delete(T t);
	
}
