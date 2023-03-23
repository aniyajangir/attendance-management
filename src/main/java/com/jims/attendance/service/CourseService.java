package com.jims.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jims.attendance.dao.CourseDao;
import com.jims.attendance.model.Course;
import com.jims.attendance.model.Subject;

@Service
public class CourseService {
	@Autowired
	CourseDao courseDao;
	
	public Course registerCourse(Course course) {
		return courseDao.save(course);
	}

	public List<Course> getCourses(){
		return courseDao.findAll();
	}
}
