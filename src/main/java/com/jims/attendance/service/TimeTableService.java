package com.jims.attendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jims.attendance.dao.TimeTableDao;
import com.jims.attendance.model.TimeTable;

@Service
public class TimeTableService {
	@Autowired
	TimeTableDao timeTableDao;

	public TimeTable registerTimeTable(TimeTable timeTable) {
		return timeTableDao.save(timeTable);
	}
}
