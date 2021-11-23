package ProyectoLenguajeSenas.logic.generic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;

@NoRepositoryBean
public interface AbstractRepositoryInterface<T extends LenguaSordo,ID> extends MongoRepository<T, ID> {
	
	
	
}
