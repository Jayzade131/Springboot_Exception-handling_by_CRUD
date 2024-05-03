package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	public User findUserByName(String name);
}
