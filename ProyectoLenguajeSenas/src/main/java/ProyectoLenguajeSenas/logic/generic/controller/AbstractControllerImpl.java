package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceInterface;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;

public abstract class AbstractControllerImpl<T> implements AbstractControllerInterface<T> {

	public AbstractControllerImpl() {
	}
	
	@Override
	public ResponseEntity<List<T>> findAllByCategory(AbstractServiceInterface<T> abstractService,String categoria) {
		return ResponseEntity.ok(abstractService.findAllByCategory(categoria));
	}

	@Override
	public ResponseEntity<T> findById(AbstractServiceInterface<T> abstractService, String id) {
		return (ResponseEntity<T>) ResponseEntity.ok(abstractService.findById(id));
	}

	@Override
	public ResponseEntity<T> findByName(AbstractServiceInterface<T> abstractService, String name) {
		return ResponseEntity.ok(abstractService.findByName(name));
	}
	
}
