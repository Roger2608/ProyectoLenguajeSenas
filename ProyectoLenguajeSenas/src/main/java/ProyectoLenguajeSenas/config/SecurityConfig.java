package ProyectoLenguajeSenas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfig{
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder){
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User
				.withUsername("user")
				.password(bCryptPasswordEncoder.encode("qwerty"))
				.roles("USER")
				.build());
		manager.createUser(
				User
				.withUsername("admin")
				.password(bCryptPasswordEncoder.encode("qwerty"))
				.roles("ADMIN")
				.build());
		return manager;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http.csrf()
	      .disable()
	      .authorizeRequests()
	      .antMatchers(HttpMethod.GET, "/lenguaSenas/category/{category}").permitAll()
	      .antMatchers(HttpMethod.GET, "/lenguaSenas//id/{id}").hasAnyRole("USER")
	      .antMatchers(HttpMethod.GET,"/lenguaSenas/name/{name}").anonymous()
	      .anyRequest().authenticated()
	      .and().httpBasic()
	      .and().cors()
	      .and().sessionManagement()
	      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    
	    //go to implementation JWT
//	      .and().addFilterBefore(filter, beforeFilter);
	    return http.build();
	}

}
