/**
 * 
 */
package com.semika;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author semika
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/") 
	public String hello() {
		Iterable<User> userIte = userService.findAll();
		
		List<User> userList = new ArrayList<User>(); 
		
		userIte.forEach(userList :: add);
		
		User semikaUser = userService.findByUserName("semika");
		
		return "Hello World, This is Semika" + new Date().toString(); 
	}
}
