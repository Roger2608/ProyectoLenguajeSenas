package ProyectoLenguajeSenas.service.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.model.security.user.User;
import ProyectoLenguajeSenas.repository.security.UserRepository;

@Service
public class UserSecurityServiceImpl implements UserSecurityService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Optional<User> getByUserName(String userName) {
		return userRepository.findByNickName(userName);
	}

	@Override
	public boolean existByUserName(String userName) {
		return userRepository.existsByNickName(userName);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

}
