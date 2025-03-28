package com.NextEducation.JobApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NextEducation.JobApp.User;



@Repository
public interface UserRepo extends JpaRepository<User, String> {

	User findByUsername(String username);

	
}
