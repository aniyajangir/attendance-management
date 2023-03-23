package com.jims.attendance.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jims.attendance.dao.CourseDao;
import com.jims.attendance.dao.SubjectDao;
import com.jims.attendance.dto.SubjectDTO;
import com.jims.attendance.model.Course;
import com.jims.attendance.model.Subject;

@Service
public class SubjectService {
	@Autowired
	SubjectDao subjectDao;
	
	@Autowired
	CourseDao courseDao;
	
	public Subject registerSubject(SubjectDTO subjectDto) {
		Subject subject = new Subject();
		
		subject.setSubjectName(subjectDto.getSubjectName());
		subject.setSubjectCode(subjectDto.getSubjectCode());
		
		Course course = courseDao.getById(subjectDto.getCourseId());
		
		subject.setCourseName(course);
		List<Subject> subjects = new ArrayList();
		subjects.add(subject);
		
		course.setSubjects(subjects);
		
		return subjectDao.save(subject);
	}
	
	public List<Subject> getSubjects(){
		return subjectDao.findAll();
	}
}

