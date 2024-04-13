package com.cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao; // FI

//	public UserService() {
//		System.out.println("UserService Default Constructor ");
//	}
	/* CI */
	// When we have only one parameterized constructor in target class then
	// @Autowired is optional.

//	@Autowired
	public UserService(UserDao userDao) {
		System.out.println("UserService:: param - Constructor");
		this.userDao = userDao;
	}
	/* SI */
//	@Autowired
//	public void setUserDao(UserDao userDao) {
//		System.out.println("inside a setter method of userservice");
//		this.userDao=userDao;
//	}

	public void getName(int id) {
		String name = userDao.findByName(id);
		System.out.println("Name:: " + name);
	}
}
