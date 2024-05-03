package com.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.main.dao.UserRepo;
import com.main.entity.User;
import com.main.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
			User createUser = userService.CreateUser(user);
			return ResponseEntity.ok(createUser);
		
	}

	@GetMapping("/show/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		
			User showUser = userService.showUser(id);
			return ResponseEntity.ok(showUser);
		
	}

}
