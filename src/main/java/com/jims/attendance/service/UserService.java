package com.jims.attendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jims.attendance.dao.UserDao;
import com.jims.attendance.model.User;

import jakarta.transaction.Transaction;
import jakarta.websocket.Session;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public User registerUser(User user) {
		return userDao.save(user);
	}
	
	
	public User getUserByEmail(String email) {
		User user = userDao.getUserByEmail(email);
		System.out.println(user);
		return user;
	}
	
	
    public boolean validate(String userName, String password) {
    	try {
        User user = userDao.getUserByEmail(userName);
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
