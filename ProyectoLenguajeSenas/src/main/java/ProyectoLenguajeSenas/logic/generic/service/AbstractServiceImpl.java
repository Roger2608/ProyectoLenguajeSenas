package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractRepository;

@Service
public class AbstractServiceImpl<T,ID> implements AbstractServiceInterface<T>{
	
	@Autowired
	AbstractRepository<T, ID> abstractRepository;
	
	public AbstractServiceImpl() {
	}
	
	@Override
	public List<T> mostrarTodos(String categoria) {
		return abstractRepository.findAll();
	}

	@Override
	public void guardar(T t, String categoria) {
		abstractRepository.save(t);
	}
	
	@Override
	public void delete(T t, String categoria) {
		abstractRepository.delete(t);
	}
	
}
