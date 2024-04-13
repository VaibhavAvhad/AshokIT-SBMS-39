package com.cc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}

	public String findByName(int id) {
		if (id == 100) {
			return "Shyam";
		} else {
			return "Ram";
		}
	}
}
