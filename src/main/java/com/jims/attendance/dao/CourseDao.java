package com.jims.attendance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jims.attendance.model.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{

}
