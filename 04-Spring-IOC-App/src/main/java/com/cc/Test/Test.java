package com.cc.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cc.service.UserService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		UserService service=context.getBean(UserService.class);
		String name=service.getName(100);
		System.out.println("user "+ name);
	}

}
