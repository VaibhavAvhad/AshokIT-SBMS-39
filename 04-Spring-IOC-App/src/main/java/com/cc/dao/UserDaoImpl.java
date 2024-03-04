package com.cc.dao;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		System.out.println("UserDaoImpl() : constructor");
	}
	
	@Override
	public String findName(int id) {
		if (id==100) {
			return "Raju";
		}else if (id==101) {
			return "Rani";
		}else {
			return " invalid ID";
		}
	}

	
	
}
