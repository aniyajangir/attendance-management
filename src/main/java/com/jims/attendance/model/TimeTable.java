package com.jims.attendance.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class TimeTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timetableId;
	@OneToOne
	private Course courses;
	private String timeSlot;
	private String studentTimetable;
	private String facultyTimetable;

	public int getTimetableId() {
		return timetableId;
	}

	public void setTimetableId(int timetableId) {
		this.timetableId = timetableId;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getStudentTimetable() {
		return studentTimetable;
	}

	public void setStudentTimetable(String studentTimetable) {
		this.studentTimetable = studentTimetable;
	}

	public String getFacultyTimetable() {
		return facultyTimetable;
	}

	public void setFacultyTimetable(String facultyTimetable) {
		this.facultyTimetable = facultyTimetable;
	}

}
