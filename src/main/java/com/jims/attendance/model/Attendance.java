package com.jims.attendance.model;

import java.sql.Date;

import java.util.List;
import com.jims.attendance.enums.AttendanceStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendanceId;
	private Date date;
	@OneToOne
	private Course course;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Subject subject;
	private String timeSlot;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<StudentAttendance> studentAttendance;

	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public List<StudentAttendance> getStudentAttendance() {
		return studentAttendance;
	}

	public void setStudentAttendance(List<StudentAttendance> studentAttendance) {
		this.studentAttendance = studentAttendance;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
