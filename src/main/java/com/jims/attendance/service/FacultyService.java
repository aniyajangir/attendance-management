package com.jims.attendance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jims.attendance.dao.FacultyDao;
import com.jims.attendance.dao.SubjectDao;
import com.jims.attendance.dao.UserDao;
import com.jims.attendance.dto.FacultyDTO;
import com.jims.attendance.dto.StudentDTO;
import com.jims.attendance.model.Faculty;
import com.jims.attendance.model.Student;
import com.jims.attendance.model.Subject;
import com.jims.attendance.model.User;

@Service
public class FacultyService {
	
	@Autowired
	FacultyDao facultyDao;
	
	@Autowired
	SubjectDao subjectDao;
	
	@Autowired
	UserDao userDao;

	public Faculty registerFaculty(FacultyDTO facultyDTO) throws Exception{
		Faculty faculty = new Faculty();
		
		faculty.setFacultyName(facultyDTO.getFacultyName());
		faculty.setFacultyEmail(facultyDTO.getFacultyEmail());
		faculty.setContactNumber(facultyDTO.getContactNumber());
		faculty.setGender(facultyDTO.getGender());
		
		User user=new User();
		user.setUserEmail(facultyDTO.getFacultyEmail());
		user.setPassword(faculty.getFacultyName().substring(0, 3)+"@"+faculty.getContactNumber().substring(0, 4));
		user.setRole("faculty");
		userDao.save(user);
		faculty.setUser(user);
		
//		Subject subject1 = subjectDao.getById(facultyDTO.getSubject1());
//		Subject subject2 = subjectDao.getById(facultyDTO.getSubject2());
//		Subject subject3 = subjectDao.getById(facultyDTO.getSubject3());
//		List<Subject> subjects = new ArrayList<>();
//		subjects.add(subject1);
//		subjects.add(subject2);
//		subjects.add(subject3);

//		
//		faculty.setSubjects(subjects);
		
		return facultyDao.save(faculty);
	}
	
	public List<Subject> getSubjects() {
		return subjectDao.getAllSubjects();
	}
	
	public Subject getSubjectById(int id) {
		return subjectDao.getById(id);
	}
	
	public Faculty getFacultyByUserId(int userId) {
		return facultyDao.getFacultyByUserId(userId);
		
	}
}
