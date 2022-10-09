package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractNoRepository;

public abstract class AbstractServiceImpl<T,ID> implements AbstractServiceInterface<T,ID>{
	
	AbstractNoRepository<T,ID> abstractRepository; 
	
	public AbstractServiceImpl() {
	}
	
	@Override
	public List<T> mostrarTodos(String ID) {
		return abstractRepository.findAll();
	}
	
	public void composeRepository(AbstractNoRepository<T,ID> abstractRepository) {
		this.abstractRepository = abstractRepository;
	}
	
}
