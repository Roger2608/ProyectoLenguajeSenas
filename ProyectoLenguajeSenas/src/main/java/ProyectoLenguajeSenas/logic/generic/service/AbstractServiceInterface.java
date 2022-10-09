package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

public interface AbstractServiceInterface<T, ID> {
	
	public abstract List<T> mostrarTodos(String ID);

}
