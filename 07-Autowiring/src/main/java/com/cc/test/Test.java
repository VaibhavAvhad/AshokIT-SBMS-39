package com.cc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cc.ATM;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	ATM obj=context.getBean(ATM.class);
	
	obj.withdraw();
	
}
}
