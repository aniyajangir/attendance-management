package com.jims.attendance.controller;

import java.util.List;

import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jims.attendance.model.Faculty;
import com.jims.attendance.model.Student;
import com.jims.attendance.model.Subject;
import com.jims.attendance.model.User;
import com.jims.attendance.service.FacultyService;
import com.jims.attendance.service.StudentService;
import com.jims.attendance.service.SubjectService;
import com.jims.attendance.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@Autowired
	StudentService studentService;

	@Autowired
	FacultyService facultyService;
	
	@Autowired
	SubjectService subjectService;

	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String processLogin(User user, Model model) {
		String email = user.getUserEmail();
		String userPassword = user.getPassword();
		System.out.println(email);
		System.out.println(userPassword);
		User actualUser = userService.getUserByEmail(email);
		String actualPassword = actualUser.getPassword();

		if (userPassword.equals(actualPassword) && user.getUserEmail() != null && user.getPassword() != null) {
			System.out.println(actualUser);
			System.out.println(email + " " + userPassword);
			int userId = actualUser.getUserId();
			String studentRole = "student";
			String facultyRole = "faculty";
			if (actualUser.getRole().equals(studentRole)) {
				Student student = studentService.getStudentByUserId(userId);
				System.out.println(student);
				model.addAttribute("student", student);
				int studentId = student.getStudentId();
				return "student-dashboard";
			}

			else if (actualUser.getRole().equals(facultyRole)) {
				Faculty faculty = facultyService.getFacultyByUserId(userId);
				System.out.println(faculty);
				model.addAttribute("faculty", faculty);
				List<Subject> subjects = subjectService.getSubjects();
				model.addAttribute("subjects", subjects);
					
				int facultyId = faculty.getFacultyId();
				
				return "faculty-dashboard";
			}
		} else {
			return "/login";
		}
		return "/login";
	}
}
