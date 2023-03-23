package com.jims.attendance.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jims.attendance.model.Subject;
public interface SubjectDao extends JpaRepository<Subject, Integer> {

	@Query("SELECT s FROM Subject s")
	List<Subject> getAllSubjects();

}
