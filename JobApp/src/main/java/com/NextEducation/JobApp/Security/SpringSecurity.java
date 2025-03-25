package com.NextEducation.JobApp.Security;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SpringSecurity {

	@Autowired
	private UserDetailsService userDetailsService;
	
	 
	@Bean
	public AuthenticationProvider authenticationProvider() {
		
		DaoAuthenticationProvider  provider = new DaoAuthenticationProvider();
		//we are working with database so DAO - Data Access Object
		
		
		provider.setUserDetailsService(userDetailsService); 
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return provider;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity hs) throws Exception {
		
		hs
		
			.csrf(customizer ->  customizer.disable())
		    .authorizeHttpRequests(request -> request.anyRequest().authenticated())
		    //.formLogin(Customizer.withDefaults()) // Enable form-based login
		    .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
		return hs.build();
	}
	
}



















//@Bean
//public UserDetailsService userDetailsService() { 
//	
//	UserDetails user = org.springframework.security.core.userdetails.User
//			.withDefaultPasswordEncoder()
//			.username("sabarish")
//			.password("sabarish@123")
//			.roles("USER")
//			.build();
//	
//	UserDetails admin = org.springframework.security.core.userdetails.User
//			.withDefaultPasswordEncoder()
//			.username("admin")
//			.password("admin@123")
//			.roles("ADMIN")
//			.build();
//	
//	return new InMemoryUserDetailsManager(user, admin);
//}
