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
	
}
