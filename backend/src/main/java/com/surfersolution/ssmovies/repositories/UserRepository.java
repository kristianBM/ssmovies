package com.surfersolution.ssmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.ssmovies.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}