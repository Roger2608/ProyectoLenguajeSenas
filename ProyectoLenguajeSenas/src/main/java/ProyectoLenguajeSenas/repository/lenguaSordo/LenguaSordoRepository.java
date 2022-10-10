package ProyectoLenguajeSenas.repository.lenguaSordo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.logic.generic.repository.AbstractNoRepository;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;

@Repository
public interface LenguaSordoRepository extends AbstractNoRepository<LenguaSordo, String>{
	
//	@Query("select t from #{#entityName} t where t.categoria.listSubCategory = ?1")
//	List<LenguaSordo> findBySubcategory(String subCategory);
	
}
