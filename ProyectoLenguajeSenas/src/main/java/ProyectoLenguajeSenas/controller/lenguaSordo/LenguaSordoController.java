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
@RequestMapping(path ="/lenguaSenas",
	produces = MediaType.APPLICATION_JSON_VALUE)
public class LenguaSordoController extends AbstractControllerImpl<LenguaSordo>{
	
	@Autowired
	LenguaSordoService service;
	
	@SuppressWarnings("unchecked")
	@GetMapping(path = "/category/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<LenguaSordo>> findAllByCategory(@PathVariable String category) {
		return super.findAllByCategory((AbstractServiceInterface<LenguaSordo>) service, category);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LenguaSordo> findbyId(@PathVariable String id) {
		return super.findById((AbstractServiceInterface<LenguaSordo>) service, id);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(path = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LenguaSordo> findByName(@PathVariable String name) {
		return super.findByName((AbstractServiceInterface<LenguaSordo>) service, name);
	}
	
//	@GetMapping(path = "/subCategory/{subCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<LenguaSordo>> findAllBySubCategory(@PathVariable String subCategory) {
//		return  ResponseEntity.ok(service.findAllBySubCategory(subCategory));
//	}

}