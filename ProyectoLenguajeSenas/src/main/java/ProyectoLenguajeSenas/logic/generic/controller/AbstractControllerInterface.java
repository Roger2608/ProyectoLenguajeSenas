package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface AbstractControllerInterface<T, ID> {

	public abstract ResponseEntity<List<T>> mostrarTodos(String ID);
//
//	public abstract ResponseEntity<MessageResponse> guardar(T t, String ID);
//
//	public abstract ResponseEntity<MessageResponse> update(T t, String ID);
//
//	public abstract ResponseEntity<MessageResponse> delete(T t, String ID);

}
