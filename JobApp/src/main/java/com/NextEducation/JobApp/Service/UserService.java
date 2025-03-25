package com.NextEducation.JobApp.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.NextEducation.JobApp.User;
import com.NextEducation.JobApp.Repo.UserRepo;


@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}


}
