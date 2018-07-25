/**
 * 
 */
package com.semika.user;

/**
 * @author semikasiriwardana
 *
 */
public interface UserService {

	public Iterable<User>  findAll();
	
	public User findByUserName(String userName);  
	
	public User findById(Long id);
	
}
