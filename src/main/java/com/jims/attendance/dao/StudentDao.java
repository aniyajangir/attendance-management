package com.jims.attendance.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.jims.attendance.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	@Query("SELECT s FROM Student s")
	List<Student> getAllStudents();
	
	@Query( value ="SELECT * from Student WHERE user_user_id=:userId", nativeQuery=true)
	Student getStudentByUserId(@Param("userId") int userId);
	
	@Query(value= "SELECT * from Student WHERE course_course_id=:courseId" , nativeQuery=true)
	Student getStudentBycourseId(@Param("courseId") int courseId);
}
