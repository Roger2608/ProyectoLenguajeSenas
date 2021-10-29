package ProyectoLenguajeSenas.logic.generic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;
import ProyectoLenguajeSenas.util.message.MessageResponse;
import ProyectoLenguajeSenas.util.message.MessageResponseOk;

public abstract class AbstractControllerImpl<T extends LenguaSordo, ID> implements AbstractControllerInterface<T>{
	
	@Autowired
	AbstractServiceImpl<T, ID> abstractService;
	
	public AbstractControllerImpl() {}
	
	@GetMapping("/letras/viewAll")
	public ResponseEntity<List<T>> mostrarTodos(){
		System.out.println("entró aquí a clase abstracta mostrar" + abstractService.mostrarTodos().get(0).getClass().getName());
		return ResponseEntity.ok(abstractService.mostrarTodos());
	}
	
	@PostMapping(path="/letras/new", 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> guardar(@RequestBody T t) {
		System.out.println("entró aquí a clase abstracta guardar" + t.getClass().getName());
		abstractService.guardar(t);
		return ResponseEntity.ok(new MessageResponseOk("guardado con exito"));
	}
	
	@PutMapping(path="/letras/update", 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> update(@RequestBody T t) {
		System.out.println("entró aquí a clase abstracta update");
		abstractService.update(t);
		return ResponseEntity.ok(new MessageResponseOk("actualizado con exito"));
	}
	
	@DeleteMapping(path="/letras/delete", 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> delete(@RequestBody T t) {
		System.out.println("entró aquí a clase abstracta delete");
		abstractService.delete(t);
		return ResponseEntity.ok(new MessageResponseOk("eliminado con exito"));
	}
}
