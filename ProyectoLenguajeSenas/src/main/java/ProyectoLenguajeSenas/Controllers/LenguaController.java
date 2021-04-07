package ProyectoLenguajeSenas.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.Categorias.Animal;
import ProyectoLenguajeSenas.Services.LenguaSenaServices;

@RestController
@RequestMapping("/lenguaSenas")
public class LenguaController {
	
	@Autowired
	LenguaSenaServices<Animal> lengua;
	
	@GetMapping("/animal/{id}")
	public ResponseEntity<Optional<Animal>> buscarCategoria(@PathVariable(value = "id") String id){
		return ResponseEntity.ok().body(lengua.finByID(id));
	}
	
	@GetMapping
	public List<Animal> mostrarPokemon(){
		return lengua.findAll();
	}
	

}
