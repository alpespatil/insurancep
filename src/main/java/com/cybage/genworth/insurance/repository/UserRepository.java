package com.cybage.genworth.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cybage.genworth.insurance.model.User;
/**
 * @author Jeevan
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
	
	//this is the custom query in project- d alias name
	@Query(value="select * from user d where city=?1", nativeQuery =true)
	List<User> findByCity(String city);

}
