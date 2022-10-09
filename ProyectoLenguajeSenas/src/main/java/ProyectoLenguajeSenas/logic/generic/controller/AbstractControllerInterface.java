package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface AbstractControllerInterface<T, ID> {

	public abstract ResponseEntity<List<T>> findAllCategory(String ID);

}
