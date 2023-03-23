package com.jims.attendance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jims.attendance.dao.CourseDao;
import com.jims.attendance.dao.StudentDao;
import com.jims.attendance.dao.UserDao;
import com.jims.attendance.dto.StudentDTO;
import com.jims.attendance.model.Course;
import com.jims.attendance.model.Student;
import com.jims.attendance.model.Subject;
import com.jims.attendance.model.User;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	CourseDao courseDao;
	
	@Autowired
	UserDao userDao;
	
	public Student registerStudent(StudentDTO studentDTO) throws Exception{
		Student student = new Student();
		
		student.setStudentName(studentDTO.getStudentName());
		student.setStudentEmail(studentDTO.getStudentEmail());
		student.setContactNumber(studentDTO.getContactNumber());
		student.setGender(studentDTO.getGender());
		
		Course course = courseDao.getById(studentDTO.getCourseId());
		
		student.setCourse(course);
		
		User user=new User();
		user.setUserEmail(studentDTO.getStudentEmail());
		user.setPassword(student.getStudentName().substring(0, 3)+"@"+student.getContactNumber().substring(0, 4));
		user.setRole("student");
		userDao.save(user);
		student.setUser(user);
		
		return studentDao.save(student);
	}
	
	public List<Student> getStudents() {
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getById(id);
	}
	
	public Student getStudentByUserId(int userId) {
		return studentDao.getStudentByUserId(userId);
	}
}
