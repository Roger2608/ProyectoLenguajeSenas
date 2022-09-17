package ProyectoLenguajeSenas.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.logic.generic.controller.AbstractControllerImpl;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;

@RestController
@RequestMapping(path ="/lenguaSenas/{categoria}",
	produces = MediaType.APPLICATION_JSON_VALUE)
public class LenguaSordoController extends AbstractControllerImpl<LenguaSordo, String>{
	
}