package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.util.message.MessageResponse;

public interface AbstractControllerInterface<T> {

	public abstract ResponseEntity<List<T>> mostrarTodos(String categoria);
	
	public abstract ResponseEntity<MessageResponse> guardar(T t, String categoria);
	
	public abstract ResponseEntity<MessageResponse> update(T t, String categoria);
	
	public abstract ResponseEntity<MessageResponse> delete(T t, String categoria);
	
}
