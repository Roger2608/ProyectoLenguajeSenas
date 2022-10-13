package ProyectoLenguajeSenas.service.security;

import java.util.Optional;

import ProyectoLenguajeSenas.model.security.user.Rol;

public interface RolSecurityService {
	
	public Optional<Rol> getByRoleName(String roleName);

}
