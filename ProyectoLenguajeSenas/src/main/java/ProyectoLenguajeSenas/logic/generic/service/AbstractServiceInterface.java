package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

public interface AbstractServiceInterface<T, ID> {
	
	public abstract List<T> mostrarTodos(String ID);

	public abstract void guardar(T t, String ID);

	public abstract void delete(T t, String ID);

}
