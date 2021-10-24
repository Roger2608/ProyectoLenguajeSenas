package ProyectoLenguajeSenas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.Categorias.Letra;
import ProyectoLenguajeSenas.Services.impl.LenguaSenaLetraServicesImpl;

@RestController
@RequestMapping("/Lengua")
public class LenguaSenaLetrasController {
	
	@Autowired
	LenguaSenaLetraServicesImpl servicioLetra;
	
	@GetMapping("/Letras")
	public List<Letra> mostrarTodos(){
		return servicioLetra.mostrarTodos();
	}

}
