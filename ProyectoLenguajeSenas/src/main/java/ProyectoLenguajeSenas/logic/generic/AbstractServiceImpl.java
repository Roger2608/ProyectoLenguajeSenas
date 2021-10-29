package ProyectoLenguajeSenas.logic.generic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;

@Service
public class AbstractServiceImpl<T extends LenguaSordo,ID> implements AbstractServiceInterface<T>{
	
	@Autowired
	AbstractRepositoryInterface<T, ID> abstractRepository;
	
	public AbstractServiceImpl() {
	}
	
	@Override
	public List<T> mostrarTodos() {
		return abstractRepository.findAll();
	}

	@Override
	public void guardar(T t) {
		abstractRepository.save(t);
	}
	
	@Override
	public void update(T t) {
		abstractRepository.save(t);
	}
	
	@Override
	public void delete(T t) {
		abstractRepository.delete(t);
	}	
	
}
