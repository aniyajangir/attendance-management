package com.jims.attendance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jims.attendance.model.Attendance;

public interface AttendanceDao extends JpaRepository<Attendance, Integer> {

}
