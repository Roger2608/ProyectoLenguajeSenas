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

	@Override
	public void guardar( T t, String ID) {
		abstractRepository.save(t);
	}
	
	@Override
	public void delete(T t, String ID) {
		abstractRepository.delete(t);
	}
	
	public void composeRepository(AbstractNoRepository<T,ID> abstractRepository) {
		this.abstractRepository = abstractRepository;
	}
	
}
