/**
 * 
 */
package com.semika;

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
		userService.sayHello();
		return "Hello World, This is Semika";
	}
}
