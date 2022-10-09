package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceInterface;

public abstract class AbstractControllerImpl<T, ID> implements AbstractControllerInterface<T,ID> {

	public AbstractControllerImpl() {
	}

	public ResponseEntity<List<T>> mostrarTodos(AbstractServiceInterface<T, ID> abstractService,String categoria) {
		return ResponseEntity.ok(abstractService.mostrarTodos(categoria));
	}

//	public ResponseEntity<MessageResponse> guardar(AbstractServiceInterface<T, ID> abstractService, T t, String categoria) {
//		abstractService.guardar(t, categoria);
//		return ResponseEntity.ok(new MessageResponseOk("guardado con exito"));
//	}
//
//	public ResponseEntity<MessageResponse> update(AbstractServiceInterface<T, ID> abstractService, T t, String categoria) {
////		abstractService.update(t, categoria);
//		return ResponseEntity.ok(new MessageResponseOk("actualizado con exito"));
//	}
//
//	public ResponseEntity<MessageResponse> delete(AbstractServiceInterface<T, ID> abstractService,T t, String categoria) {
//		abstractService.delete(t, categoria);
//		return ResponseEntity.ok(new MessageResponseOk("eliminado con exito"));
//	}
}
