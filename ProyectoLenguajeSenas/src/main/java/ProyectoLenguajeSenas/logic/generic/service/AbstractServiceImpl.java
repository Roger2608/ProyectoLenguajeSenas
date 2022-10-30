package ProyectoLenguajeSenas.logic.generic.service;

import java.util.List;
import java.util.Optional;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractNoRepository;

public abstract class AbstractServiceImpl<T,ID> implements AbstractServiceInterface<T>{
	
	AbstractNoRepository<T,ID> abstractRepository; 
	
	public AbstractServiceImpl() {
	}
	
	@Override
	public List<T> findAllByCategory(Integer category) {
		return abstractRepository.findByCategory(category);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Optional<T> findById(Integer id) {
		return abstractRepository.findById((ID) id);
	}
	
	@Override
	public Optional<T> findByName(String name) {
		return abstractRepository.findByName(name);
	}
	
	public void composeRepository(AbstractNoRepository<T,ID> abstractRepository) {
		this.abstractRepository = abstractRepository;
	}
	
}
