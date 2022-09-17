package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

public interface AbstractServiceInterface<T> {
	
	public abstract List<T> mostrarTodos(String categoria);
	
	public abstract void guardar(T t, String categoria);
	
	public abstract void delete(T t, String categoria);
	
}
