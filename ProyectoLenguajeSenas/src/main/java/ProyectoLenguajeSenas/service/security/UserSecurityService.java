package ProyectoLenguajeSenas.service.security;

import java.util.Optional;

import ProyectoLenguajeSenas.model.security.user.User;

public interface UserSecurityService {

	public Optional<User> getByUserName(String userName);
	
	public boolean existByUserName(String userName);
	
	public void save(User user);

}
