package ar.ivan.SeguridadSpring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {


		UserBuilder usuarios=User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(usuarios.username("Ivan").password("123").roles("administrador"))
		.withUser(usuarios.username("Evelyn").password("123456").roles("usuario"))
		.withUser(usuarios.username("Valentín").password("456").roles("ayudante"))
		.withUser(usuarios.username("Ailen").password("2468").roles("administrador"));
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().anyRequest().authenticated().and().formLogin()
		.loginPage("/miFormularioLogin")
		.loginProcessingUrl("/autenticacionUsuario")
		.permitAll();
	}
	
	
	
	

	
	
}
