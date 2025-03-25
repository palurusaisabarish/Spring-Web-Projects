package com.NextEducation.JobApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.NextEducation.JobApp.User;
import com.NextEducation.JobApp.UserPrincipal;
import com.NextEducation.JobApp.Repo.UserRepo;



@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user =  userRepo.findByUsername(username);
		if(user == null) {
			System.out.println("User Not Found -404 ");
			throw new  UsernameNotFoundException("User Not Found -404 ");
		}
		 
		 return new UserPrincipal(user);
	}

}
