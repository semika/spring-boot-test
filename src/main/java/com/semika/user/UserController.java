/**
 * 
 */
package com.semika.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@Autowired
	private KafkaTemplate kafkaTemplate;

	@RequestMapping("/users") 
	public Iterable<User> findAll() {
		
		Iterable<User> userIte = userService.findAll();
		
		List<User> userList = new ArrayList<User>(); 
		
		userIte.forEach(userList :: add);
		
		return userIte; 
	}
	
	@RequestMapping("/{id}")
	public User findById(@PathVariable(value="id") Long id, @RequestParam String msg) {
		kafkaTemplate.send("test", msg); 
		return userService.findById(id);
	}
	
	
}
