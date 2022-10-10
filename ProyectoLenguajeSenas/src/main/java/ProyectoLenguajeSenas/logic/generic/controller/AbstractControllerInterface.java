package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceInterface;

public interface AbstractControllerInterface<T> {

	public abstract ResponseEntity<List<T>> findAllByCategory(AbstractServiceInterface<T> abstractService, String Category);
	public abstract ResponseEntity<T> findById(AbstractServiceInterface<T> abstractService, String id);
	public abstract ResponseEntity<T> findByName(AbstractServiceInterface<T> abstractService, String name);

}
