package ProyectoLenguajeSenas.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.Categorias.Letra;
import ProyectoLenguajeSenas.logic.generic.AbstractControllerImpl;

@RestController
@RequestMapping(path ="/lenguaSenas",
	produces = MediaType.APPLICATION_JSON_VALUE)
public class LenguaSenaLetrasController extends AbstractControllerImpl<Letra, String>{
	
//	@Autowired
//	LenguaSenaLetraServicesImpl servicioLetra;
//	
//	@GetMapping("/letras/viewAll")
//	public ResponseEntity<List<Letra>> mostrarTodos(){
//		System.out.println("entró aquí");
//		return ResponseEntity.ok(servicioLetra.mostrarTodos());
//	}
//	
//	@PostMapping(path="/letras/new", 
//			consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<MessageResponse> guardar(@RequestBody Letra letra) {
//		servicioLetra.guardarLetra(letra);
//		return ResponseEntity.ok(new MessageResponseOk("guardado con exito"));
//	}
//	
//	@PutMapping(path="/letras/update", 
//			consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<MessageResponse> update(@RequestBody Letra letra) {
//		servicioLetra.actualizarLetra(letra);
//		return ResponseEntity.ok(new MessageResponseOk("actualizado con exito"));
//	}
//	
//	@DeleteMapping(path="/letras/delete", 
//			consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<MessageResponse> delete(@RequestBody Letra letra) {
//		servicioLetra.eliminarLetra(letra);
//		return ResponseEntity.ok(new MessageResponseOk("eliminado con exito"));
//	}
	
}
