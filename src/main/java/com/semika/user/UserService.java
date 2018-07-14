/**
 * 
 */
package com.semika.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author semika
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository; 
	
	public Iterable<User>  findAll() {
		return  userRepository.findAll();
	}
	
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName); 
	}
}
