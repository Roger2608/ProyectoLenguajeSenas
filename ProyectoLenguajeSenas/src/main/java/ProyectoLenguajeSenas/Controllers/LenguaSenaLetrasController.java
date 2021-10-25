package ProyectoLenguajeSenas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.Categorias.Letra;
import ProyectoLenguajeSenas.Services.impl.LenguaSenaLetraServicesImpl;
import ProyectoLenguajeSenas.util.message.MessageResponse;
import ProyectoLenguajeSenas.util.message.MessageResponseOk;

@RestController
@RequestMapping(path ="/lenguaSenas",
	produces = MediaType.APPLICATION_JSON_VALUE)
public class LenguaSenaLetrasController {
	
	@Autowired
	LenguaSenaLetraServicesImpl servicioLetra;
	
	@GetMapping("/letras/viewAll")
	public List<Letra> mostrarTodos(){
		return servicioLetra.mostrarTodos();
	}
	
	@PostMapping(path="/letras/new", 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MessageResponse> guardar(@RequestBody Letra letra) {
		servicioLetra.guardarActualizar(letra);
		return ResponseEntity.ok(new MessageResponseOk("guardado con exito"));
	}

}
