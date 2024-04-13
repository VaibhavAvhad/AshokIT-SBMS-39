package com.cc.service;

import com.cc.dao.BookDao;

public class BookServiceImpl implements BookService {
	private BookDao bookDao;


	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}


	@Override
	public boolean saveBook() {
	boolean status = bookDao.save();	
	if (status) {
		System.out.println("Record inserted sucesfully");
	}
	else {
		System.out.println("Record not inserted");
	}
		return true;
	}

}
