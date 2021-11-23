package ProyectoLenguajeSenas.logic.generic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;
import ProyectoLenguajeSenas.util.ClassFactory;

@SuppressWarnings("unchecked")
@Service
public class AbstractServiceImpl<T extends LenguaSordo,ID> implements AbstractServiceInterface<T>{
	
	
	@Autowired
	ClassFactory classFactory;
	
	public AbstractServiceImpl() {
	}
	
	@Override
	public List<T> mostrarTodos(String categoria) {
		return (List<T>) obtencion(categoria).findAll();
	}

	@Override
	public void guardar(T t, String categoria) {
		obtencion(categoria).insert(t);
	}
	
	@Override
	public void update(T t, String categoria) {
		obtencion(categoria).save(t);
	}
	
	@Override
	public void delete(T t, String categoria) {
		obtencion(categoria).delete(t);
	}

	@Override
	public List<T> buscarPorCategoria(String categoria) {
		return (List<T>) obtencion(categoria).findAll();
	}	
	
	public MongoRepository<T, ID> obtencion(String categoria) {
		return classFactory.returnClassLenguaSordo(categoria.toUpperCase());
	}
	
}
