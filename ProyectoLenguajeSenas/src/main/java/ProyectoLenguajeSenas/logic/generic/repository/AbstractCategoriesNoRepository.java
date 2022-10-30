package ProyectoLenguajeSenas.logic.generic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractCategoriesNoRepository<T, ID> extends JpaRepository<T, ID> {
	
	@Query("select t from #{#entityName} t where t.nombre = ?1")
	Optional<T> findByName(String nombre);

}
