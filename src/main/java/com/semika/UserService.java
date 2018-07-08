/**
 * 
 */
package com.semika;

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
	
	public void sayHello() {
		userRepository.sayHello();
	}
}
