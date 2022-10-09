package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceInterface;

public abstract class AbstractControllerImpl<T, ID> implements AbstractControllerInterface<T,ID> {

	public AbstractControllerImpl() {
	}

	public ResponseEntity<List<T>> mostrarTodasCategorias(AbstractServiceInterface<T, ID> abstractService,String categoria) {
		return ResponseEntity.ok(abstractService.mostrarTodos(categoria));
	}
	
}
