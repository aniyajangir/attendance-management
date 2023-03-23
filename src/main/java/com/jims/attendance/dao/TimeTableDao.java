package com.jims.attendance.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jims.attendance.model.TimeTable;
public interface TimeTableDao extends JpaRepository<TimeTable, Integer> {
	
}
