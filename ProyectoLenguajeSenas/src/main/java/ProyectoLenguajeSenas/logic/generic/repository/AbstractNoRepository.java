package ProyectoLenguajeSenas.logic.generic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractNoRepository<T,ID> extends AbstractCategoriesNoRepository<T, ID>, JpaRepository<T, ID>  {
	
	@Query("select t from #{#entityName} t where t.categoria.id = ?1")
	List<T> findByCategory(int category);


}
