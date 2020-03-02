package com.jacaranda.brenes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.jacaranda.brenes.model.dto.UsuarioDTO;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ROOT");     
	}
	    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic().and().csrf().disable();
    } 
    
    protected void configure(AuthenticationManagerBuilder auth, UsuarioDTO usuario) throws Exception {
		auth.inMemoryAuthentication().withUser(usuario.getUsuario()).password("{noop}"+usuario.getContrasena()).roles("ROOT");     
	}
    
    protected void configureLogin(HttpSecurity http) throws Exception {
        http.authorizeRequests()
          .anyRequest().authenticated()
          .and().formLogin()
          .loginPage("/login").permitAll();
    }
    
    protected void configureLogout(HttpSecurity http) throws Exception {
        http.logout();
    }

}