package com.ccavenue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
	 
	  RestuarantService rs= context.getBean(RestuarantService.class);  //getBean() call the object which create by IOC
	  rs.paymentDetails(400);
	}

}
