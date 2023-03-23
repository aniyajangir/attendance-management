package com.jims.attendance.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jims.attendance.dao.FacultyDao;
import com.jims.attendance.dao.StudentDao;
import com.jims.attendance.dao.SubjectDao;
import com.jims.attendance.dto.FacultyDTO;
import com.jims.attendance.dto.StudentDTO;
import com.jims.attendance.dto.SubjectDTO;
import com.jims.attendance.model.Admin;
import com.jims.attendance.model.Attendance;
import com.jims.attendance.model.Course;
import com.jims.attendance.model.Faculty;
import com.jims.attendance.model.Student;
import com.jims.attendance.model.Subject;
import com.jims.attendance.model.TimeTable;
import com.jims.attendance.model.User;
import com.jims.attendance.service.AttendanceService;
import com.jims.attendance.service.CourseService;
import com.jims.attendance.service.FacultyService;
import com.jims.attendance.service.StudentService;
import com.jims.attendance.service.SubjectService;
import com.jims.attendance.service.TimeTableService;
import com.jims.attendance.service.UserService;

@Controller
public class AdminController {


	@Autowired
	AttendanceService attendanceService;

	@Autowired
	CourseService courseService;

	@Autowired
	FacultyService facultyService;

	@Autowired
	StudentService studentService;

	@Autowired
	SubjectService subjectService;

	@Autowired
	TimeTableService timeTableService;

	@Autowired
	UserService userService;
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	FacultyDao facultyDao;
	
	@Autowired
	SubjectDao subjectDao;



	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/attendance")
	public Attendance registerNewAttendance(@RequestBody Attendance attendance) {
		return attendanceService.takeAttendance(attendance);
	}

	@PostMapping("/course")
	public Course registerNewCourse(@RequestBody Course course) {
		return courseService.registerCourse(course);
	}
	
	@GetMapping("/register-student")
	public String getStudentRegisterPage() {
		return "register-student";
	}
	
	@GetMapping("/register-course")
	public String getCourseRegisterPage() {
		return "register-course";
	}
	
	@GetMapping("/register-subject")
	public String getSubjectRegisterPage() {
		return "register-subject";
	}
	
	
	@GetMapping("/student-dashboard/{studentId}")
	public String studentDashboard(@PathVariable int studentId ,Model model) {
		try {
			Student theStudent = studentService.getStudentById(studentId);
			model.addAttribute("student", theStudent);
		} catch (Exception e) {
			System.out.println(e);
			return "login";
		}
		return "student-dashboard";
	}
	
	@GetMapping("/student-dashboard")
	public String getStudentDashboard() {
		return "student-dashboard";
	}
	
	@GetMapping("/take-attendance")
	public String takeAttendance(Model model){
		List<Student> students = studentDao.findAll();
		List<Subject> subjects = subjectDao.findAll();
//		Faculty faculty = facultyDao.getById(facultyId);
//		model.addAttribute("faculty", faculty);
		model.addAttribute("students", students);
		model.addAttribute("subjects",subjects);
		
		return "take-attendance";
		
	}
	
	@GetMapping("/register-faculty")
	public String getRegisterFacultyPage(Model model) {
		List<Subject> subjects = subjectService.getSubjects();
		model.addAttribute("subjects", subjects);
		List<Course> courses = courseService.getCourses();
		model.addAttribute("courses",courses);
		return "register-faculty";
	}
	
	@GetMapping("/duplicate-email")
	public String getDuplicateEmailPage() {
		return "duplicate-email";
	}
	
	@GetMapping("/process")
	public String registrationProcess() {
		return "process";
	}
	
	@PostMapping("/save-course")
	public String registerNewCourse1(Course course) {
		try {
			courseService.registerCourse(course);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return "register-course";
		}
		return "register-course-successful";
	}
	
	@PostMapping("/save-subject")
	public String registerNewSubject1(SubjectDTO subjectDTO) {
		try {
			subjectService.registerSubject(subjectDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return "register-subject";
		}
		return "register-subject-successful";
	}
	
	@PostMapping("/save-faculty")
	public String registerNewFaculty1(FacultyDTO faculty) {
		try {
			System.out.println(faculty);
			facultyService.registerFaculty(faculty);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Email address already registered"+e);
			return "duplicate-email";
		}
		return "register-faculty-successful";
	}

	
	@PostMapping("/save-student")
	public String registerNewStudent(StudentDTO studentDTO) {
		try {
			studentService.registerStudent(studentDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Email address already registered"+e);
			return "duplicate-email";
		}
		return "register-student-successful";
	}

	@PostMapping("/subject")
	public Subject registerNewSubject(@RequestBody SubjectDTO subjectDTO) {
		return subjectService.registerSubject(subjectDTO);
	}

	@PostMapping("/timeTable")
	public TimeTable registerNewTimeTable(@RequestBody TimeTable timeTable) {
		return timeTableService.registerTimeTable(timeTable);
	}

	@PostMapping("/user")
	public User registerNewUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@GetMapping("/students")
	public String listStudents(Model  model) {
		List<Student> theStudents = studentService.getStudents();
		System.out.println(theStudents);
		model.addAttribute("students", theStudents);
		return "student-list";
	}
	
	
}
