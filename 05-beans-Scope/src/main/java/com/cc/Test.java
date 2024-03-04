package com.cc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	PasswordService pwd1=context.getBean(PasswordService.class);
	PasswordService pwd2=context.getBean(PasswordService.class);
	
	System.out.println(pwd1.hashCode());
	System.out.println(pwd2.hashCode());
	
	String encpwdd=pwd1.encPwd("abgdwd6e2e@");
	System.out.println(encpwdd);
}
}
