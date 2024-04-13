package com.cc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cc.service.BookService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		BookService service=context.getBean(BookService.class);
		service.saveBook();
		
		
	}

}
