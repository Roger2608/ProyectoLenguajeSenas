package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;
import java.util.Optional;

public interface AbstractServiceInterface<T> {
	
	public abstract List<T> findAllByCategory(Integer category);
	public abstract Optional<T> findById(Integer id);
	public abstract Optional<T> findByName(String name);
	
}
