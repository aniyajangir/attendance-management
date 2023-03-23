package com.jims.attendance.dto;

import java.util.List;

import com.jims.attendance.enums.Gender;
import com.jims.attendance.model.Course;
import com.jims.attendance.model.Subject;

public class FacultyDTO {
	private String facultyName;
	private Gender gender;
	private String facultyEmail;
	private String contactNumber;
//	private int subject1;
//	private int subject2;
//	private int subject3;
	private List<Subject> subjects;

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFacultyEmail() {
		return facultyEmail;
	}

	public void setFacultyEmail(String facultyEmail) {
		this.facultyEmail = facultyEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

//	public int getSubject1() {
//		return subject1;
//	}
//
//	public void setSubject1(int subject1) {
//		this.subject1 = subject1;
//	}
//
//	public int getSubject2() {
//		return subject2;
//	}
//
//	public void setSubject2(int subject2) {
//		this.subject2 = subject2;
//	}
//
//	public int getSubject3() {
//		return subject3;
//	}
//
//	public void setSubject3(int subject3) {
//		this.subject3 = subject3;
//	}
//
//	@Override
//	public String toString() {
//		return "FacultyDTO [facultyName=" + facultyName + ", gender=" + gender + ", facultyEmail=" + facultyEmail
//				+ ", contactNumber=" + contactNumber + ", subject1=" + subject1 + ", subject2=" + subject2
//				+ ", subject3=" + subject3 + ", subjects=" + subjects + "]";
//	}

}
