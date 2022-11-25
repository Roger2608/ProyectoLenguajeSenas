package ProyectoLenguajeSenas.repository.lenguaSordo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractCategoriesNoRepository;
import ProyectoLenguajeSenas.model.lenguaSordo.CategoriaLenguaSordo;

public interface CategoriaLenguaSordoRepository extends AbstractCategoriesNoRepository<CategoriaLenguaSordo, Integer>{
	
	@Query("select t from #{#entityName} t where t.nombre = ?1 and t.pais.nombre = ?2")
	Optional<CategoriaLenguaSordo> findByName(String nombre,String pais);


}
