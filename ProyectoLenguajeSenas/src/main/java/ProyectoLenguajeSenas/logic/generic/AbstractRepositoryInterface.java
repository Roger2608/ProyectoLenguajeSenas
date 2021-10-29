package ProyectoLenguajeSenas.logic.generic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;

@Repository
public interface AbstractRepositoryInterface<T extends LenguaSordo, ID> extends MongoRepository<T, ID> {
}
