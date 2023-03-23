package com.jims.attendance.dao;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jims.attendance.model.User;
public interface UserDao extends JpaRepository<User, Integer> {
	
	@Query( value ="SELECT * from User WHERE user_email=:email", nativeQuery=true)
	public User getUserByEmail(@Param("email") String email);
	

}
