
package com.cc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Engine eng = context.getBean(Engine.class);
		eng.m2();
		context.close();

	}
}

//=================
//Bean life cycle
//=================
//
//Thread Life Cycle  : will be managed by thread schedular
//
//Servlets Life Cycle : will be managed by Servlet Container
//
//Spring Bean Life Cycle : will be managed by IOC container
//
//
//init-method : After bean obj creation
//
//destory-method : When ioc is closed 
//
//<bean id="eng" class="in.ashokit.Engine"
//				init-method="m1"
//				destory-method="m2" />

