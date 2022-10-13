package ProyectoLenguajeSenas.repository.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.model.security.user.Rol;

@Repository
public interface RoleRepository extends JpaRepository <Rol, Long> {
    Optional<Rol> findByNombre(String nombre);
}
