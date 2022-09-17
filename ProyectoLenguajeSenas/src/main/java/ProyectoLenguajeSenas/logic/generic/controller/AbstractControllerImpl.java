package ProyectoLenguajeSenas.logic.generic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceImpl;
import ProyectoLenguajeSenas.util.message.MessageResponse;
import ProyectoLenguajeSenas.util.message.MessageResponseOk;

public abstract class AbstractControllerImpl<T, ID> implements AbstractControllerInterface<T> {

	@Autowired
	AbstractServiceImpl<T, ID> abstractService;

	public AbstractControllerImpl() {
	}

	@GetMapping(path = "/viewAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<T>> mostrarTodos(@PathVariable String categoria) {
		return ResponseEntity.ok(abstractService.mostrarTodos(categoria));
	}

	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> guardar(@RequestBody T t, @PathVariable String categoria) {
		abstractService.guardar(t, categoria);
		return ResponseEntity.ok(new MessageResponseOk("guardado con exito"));
	}

	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> update(@RequestBody T t, @PathVariable String categoria) {
//		abstractService.update(t, categoria);
		return ResponseEntity.ok(new MessageResponseOk("actualizado con exito"));
	}

	@DeleteMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> delete(@RequestBody T t, @PathVariable String categoria) {
		abstractService.delete(t, categoria);
		return ResponseEntity.ok(new MessageResponseOk("eliminado con exito"));
	}
}
