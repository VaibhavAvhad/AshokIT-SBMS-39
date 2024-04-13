package ccom.cc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student s=context.getBean(Student.class);
		System.out.println(s);
		// If there is no toString() method in entity class then it call the super class(object) to string method and value of object like : ccom.cc.Student@355ce81c
		System.out.println(s.hashCode());
	
	}
}
