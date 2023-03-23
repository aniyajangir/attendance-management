package com.jims.attendance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jims.attendance.model.Faculty;

public interface FacultyDao extends JpaRepository<Faculty, Integer> {

	@Query( value ="SELECT * from Faculty WHERE user_user_id=:userId", nativeQuery=true)
	Faculty getFacultyByUserId(@Param("userId") int userId);

}
