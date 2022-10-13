package ProyectoLenguajeSenas.service.security;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsSecurityService {

	UserDetails loadUserByUsername(String userName);

}
