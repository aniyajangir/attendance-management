package com.jims.attendance.model;

import java.util.List;

public class Admin {
	private List<Course> courses;
	private List<Faculty> faculties;
	private List<TimeTable> timetables;
	private List<Subject> subjects;
	private List<Student> students;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}

	public List<TimeTable> getTimetables() {
		return timetables;
	}

	public void setTimetables(List<TimeTable> timetables) {
		this.timetables = timetables;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
