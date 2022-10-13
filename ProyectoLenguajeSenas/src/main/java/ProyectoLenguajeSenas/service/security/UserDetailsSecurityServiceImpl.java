package ProyectoLenguajeSenas.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.model.security.user.MainUser;
import ProyectoLenguajeSenas.model.security.user.User;

@Service
public class UserDetailsSecurityServiceImpl implements UserDetailsSecurityService{
	
	@Autowired
	UserSecurityService userService;

	@Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        User user = userService.getByUserName(userName).get();
        return MainUser.build(user);
    }

}
