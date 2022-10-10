package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

public interface AbstractServiceInterface<T> {
	
	public abstract List<T> findAllByCategory(String category);
	public abstract T findById(String id);
	public abstract T findByName(String name);
	
}
