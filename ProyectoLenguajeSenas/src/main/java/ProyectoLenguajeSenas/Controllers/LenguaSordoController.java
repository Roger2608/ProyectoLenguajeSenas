package ProyectoLenguajeSenas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.logic.generic.controller.AbstractControllerImpl;
import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceInterface;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;
import ProyectoLenguajeSenas.service.lenguaSordo.LenguaSordoService;

@RestController
@RequestMapping(path ="/lenguaSenas/{categoria}",
	produces = MediaType.APPLICATION_JSON_VALUE)
public class LenguaSordoController extends AbstractControllerImpl<LenguaSordo, String>{
	
	@Autowired
	LenguaSordoService service;
	
	@SuppressWarnings("unchecked")
	@GetMapping(path = "/viewAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<LenguaSordo>> mostrarTodos(@PathVariable String categoria) {
		return super.mostrarTodos((AbstractServiceInterface<LenguaSordo, String>) service, categoria);
	}

//	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<MessageResponse> guardar(@RequestBody T t, @PathVariable String categoria) {
//		abstractService.guardar(t, categoria);
//		return ResponseEntity.ok(new MessageResponseOk("guardado con exito"));
//	}
//
//	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<MessageResponse> update(@RequestBody T t, @PathVariable String categoria) {
////		abstractService.update(t, categoria);
//		return ResponseEntity.ok(new MessageResponseOk("actualizado con exito"));
//	}
//
//	@DeleteMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<MessageResponse> delete(@RequestBody T t, @PathVariable String categoria) {
//		abstractService.delete(t, categoria);
//		return ResponseEntity.ok(new MessageResponseOk("eliminado con exito"));
//	}
	
}