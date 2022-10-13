package ProyectoLenguajeSenas.repository.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.model.security.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select t from #{#entityName} t where t.login.nickName = ?1")
	Optional<User> findByNickName(String nombre);

	@Query("select t from #{#entityName} t where t.login.nickName = ?1")
	boolean existsByNickName(String nombre);

}
