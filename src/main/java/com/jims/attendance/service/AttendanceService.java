package com.jims.attendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jims.attendance.dao.AttendanceDao;
import com.jims.attendance.model.Attendance;

@Service
public class AttendanceService {
	@Autowired
	AttendanceDao attendanceDao;

	public Attendance takeAttendance(Attendance attendance) {
		return attendanceDao.save(attendance);
	}
	
}
