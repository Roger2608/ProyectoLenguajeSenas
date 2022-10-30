package ProyectoLenguajeSenas.repository.lenguaSordo;

import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractNoRepository;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;

@Repository
public interface LenguaSordoRepository extends AbstractNoRepository<LenguaSordo, Integer>{
	
//	@Query("select t from #{#entityName} t where t.categoria.listSubCategory = ?1")
//	List<LenguaSordo> findBySubcategory(String subCategory);
	
	
}
