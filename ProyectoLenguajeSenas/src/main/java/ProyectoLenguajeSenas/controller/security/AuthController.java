package ProyectoLenguajeSenas.controller.security;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProyectoLenguajeSenas.model.security.jwt.JwtProvider;
import ProyectoLenguajeSenas.model.security.request.JwtDto;
import ProyectoLenguajeSenas.model.security.request.LoginUser;
import ProyectoLenguajeSenas.model.security.request.Message;
import ProyectoLenguajeSenas.model.security.request.NewUser;
import ProyectoLenguajeSenas.model.security.user.Login;
import ProyectoLenguajeSenas.model.security.user.Rol;
import ProyectoLenguajeSenas.model.security.user.User;
import ProyectoLenguajeSenas.service.security.RolSecurityService;
import ProyectoLenguajeSenas.service.security.UserSecurityService;

@RestController
@RequestMapping("/lenguaSenas/auth")
public class AuthController {

	@Autowired
	private AuthenticationManagerBuilder authenticationManagerBuilder;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserSecurityService userService;
	@Autowired
	private RolSecurityService roleService;
	@Autowired
	private JwtProvider jwtProvider;

	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody LoginUser loginUser) {
		try {
			UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword());
			Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
			SecurityContextHolder.getContext().setAuthentication(authentication);
			String jwt = jwtProvider.generateToken(authentication);
			JwtDto jwtDto = new JwtDto(jwt);
			return new ResponseEntity<>(jwtDto, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new Message("Revise sus credenciales"), HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/register")
	public ResponseEntity<Object> resgister(@Valid @RequestBody NewUser newUser) {
		Login login = new Login();
		login.setNickName(newUser.getUserName());
		login.setPassword(passwordEncoder.encode(newUser.getPassword()));
		User user = new User();
		user.setApellido(newUser.getApellido());
		user.setNombre(newUser.getNombre());
		user.setEmail(newUser.getEmail());
		user.setTelefono(newUser.getTelefono());
		user.setStatus(newUser.getStatus());
		user.setLogin(login);
		user.setCreatedDate(LocalDate.now());
		user.setUpdateDate(LocalDate.now());

		Set<Rol> roles = new HashSet<>();
		roles.add(roleService.getByRoleName("ROLE_USER").get());
//		if (newUser.getRoles().contains("ADMIN"))
//			roles.add(roleService.getByRoleName("ROLE_ADMIN").get());
		user.setRol(roles);
		userService.save(user);
		return new ResponseEntity<>(new Message("Registro exitoso! Inicie sesión"), HttpStatus.CREATED);
	}

}
