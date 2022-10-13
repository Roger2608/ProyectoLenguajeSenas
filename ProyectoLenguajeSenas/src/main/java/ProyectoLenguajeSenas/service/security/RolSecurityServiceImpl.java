package ProyectoLenguajeSenas.service.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.model.security.user.Rol;
import ProyectoLenguajeSenas.repository.security.RoleRepository;

@Service
public class RolSecurityServiceImpl implements RolSecurityService{
	
	@Autowired
	RoleRepository rolRepository;

	@Override
	public Optional<Rol> getByRoleName(String roleName) {
		return rolRepository.findByNombre(roleName);
	}

}
