/**
 * 
 */
package com.semika.user;


import org.springframework.data.repository.CrudRepository;

/**
 * @author semika
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUserName(String userName);
}
