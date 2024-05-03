package com.main.service;

import java.util.Optional;

import com.main.entity.User;

public interface UserService {
	
public User CreateUser(User user);

public User showUser(Long id);
}
