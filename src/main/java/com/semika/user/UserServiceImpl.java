/**
 * 
 */
package com.semika.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author semika
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> findAll() {
		return  userRepository.findAll();
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName); 
	}

	@Override
	public User findById(Long id) {
		
		Optional<User> userOpt = userRepository.findById(id); 
		
		if (!userOpt.isPresent()) {
            throw new RuntimeException("Unable to find user for id" + id);
        }
		
        return userOpt.get();
        
	} 

}
