package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.logic.generic.service.AbstractServiceImpl;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;
import ProyectoLenguajeSenas.repository.lenguaSordo.LenguaSordoRepository;

@Service
public class LenguaSordoServiceImpl extends AbstractServiceImpl<LenguaSordo, String> implements LenguaSordoService{
	
	@Autowired
	LenguaSordoRepository repository;

	public LenguaSordoServiceImpl() {
		super();
	}
	
	@PostConstruct
	public void coomposeAbstService() {
		super.composeRepository(repository);
	}
	
	public List<LenguaSordo> mostrarTodos(String categoria){
		return super.mostrarTodos(categoria);
	}

}
