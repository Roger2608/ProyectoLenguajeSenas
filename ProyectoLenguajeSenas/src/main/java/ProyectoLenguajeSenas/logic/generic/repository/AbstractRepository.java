package ProyectoLenguajeSenas.logic.generic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractRepository<T,ID> extends JpaRepository<T, ID> {
	
}
