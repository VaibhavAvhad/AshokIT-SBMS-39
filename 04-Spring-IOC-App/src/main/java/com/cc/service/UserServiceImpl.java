package com.cc.service;

import com.cc.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;


	public UserServiceImpl() {
		System.out.println("UserServiceImpl() 0 param : constructor");
	}
	
	public UserServiceImpl(UserDao userDao) {
		System.out.println("UserServiceImpl() 1 param : constructor");
	this.userDao=userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		System.out.println("inside a setter method of UserServiceImpl");
		this.userDao=userDao;
	}
	
	@Override
	public String getName(int id) {
		return userDao.findName(id);
		 
	}

}
