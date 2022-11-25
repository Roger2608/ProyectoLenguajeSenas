package ProyectoLenguajeSenas.repository.lenguaSordo;

import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractCategoriesNoRepository;
import ProyectoLenguajeSenas.model.lenguaSordo.Pais;

@Repository
public interface PaisRepository extends AbstractCategoriesNoRepository<Pais, Integer> {

}
