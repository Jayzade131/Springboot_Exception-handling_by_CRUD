package com.main.serviceimple;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.UserRepo;
import com.main.entity.User;
import com.main.service.UserService;
import com.main.userExceptions.UserrAlreadyExistException;
import com.main.userExceptions.UserrNotFoundException;
@Service
public class UserServiceImple implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public User CreateUser(User user) {
			User findUserByName = this.userRepo.findUserByName(user.getName());
			if(findUserByName==null) {
		 
		return this.userRepo.save(user);
		}
			else {
				throw new UserrAlreadyExistException("USER ALREADY EXIST");
			}
	}

	@Override
	public User showUser(Long id)
	{
		 
	 
	return this.userRepo.findById(id).orElseThrow(() ->new UserrNotFoundException("NO USER PRESENT WITH ID = " + id));
	
		
	}
}
