package ProyectoLenguajeSenas.logic.generic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractNoRepository<T,ID> extends JpaRepository<T, ID>  {

}
