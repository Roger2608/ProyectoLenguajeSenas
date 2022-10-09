package ProyectoLenguajeSenas.controller.lenguaSordo;

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
	public ResponseEntity<List<LenguaSordo>> findAllCategory(@PathVariable String categoria) {
		return super.mostrarTodasCategorias((AbstractServiceInterface<LenguaSordo, String>) service, categoria);
	}
	
	// Go to find by ID
	// Go to find by name
	// Go to find All by sub_category

}