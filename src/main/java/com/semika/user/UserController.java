/**
 * 
 */
package com.semika.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author semika
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService; 

	@RequestMapping("/users") 
	public Iterable<User> findAll() {
		
		Iterable<User> userIte = userService.findAll();
		
		List<User> userList = new ArrayList<User>(); 
		
		userIte.forEach(userList :: add);
		
		return userIte;
	}
	
	@RequestMapping("/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
}
