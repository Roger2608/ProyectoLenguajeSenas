package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractNoRepository;

public abstract class AbstractServiceImpl<T,ID> implements AbstractServiceInterface<T>{
	
	AbstractNoRepository<T,ID> abstractRepository; 
	
	public AbstractServiceImpl() {
	}
	
	@Override
	public List<T> findAllByCategory(String category) {
		return abstractRepository.findByCategory(category);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T findById(String id) {
		return (T) abstractRepository.findById((ID) id);
	}
	
	@Override
	public T findByName(String name) {
		return abstractRepository.findByName(name);
	}
	
	public void composeRepository(AbstractNoRepository<T,ID> abstractRepository) {
		this.abstractRepository = abstractRepository;
	}
	
}
