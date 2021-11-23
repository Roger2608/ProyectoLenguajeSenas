package ProyectoLenguajeSenas.Repositorys;

import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.Categorias.Animal;
import ProyectoLenguajeSenas.logic.generic.AbstractRepositoryInterface;

@Repository
public interface LenguaSenaAnimal extends AbstractRepositoryInterface<Animal, String> {
	
}
