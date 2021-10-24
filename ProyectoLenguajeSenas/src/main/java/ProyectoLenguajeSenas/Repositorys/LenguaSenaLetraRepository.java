package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.Categorias.Letra;

@Repository
public interface LenguaSenaLetraRepository extends MongoRepository<Letra, String> {

}
