package com.cc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	@Autowired
	//@Qualifier("chip64")
	private IChip chip;

	public void doWork() {
		boolean status = chip.process();
		if (status) {
			System.out.println("Robot is working");
		} else {
			System.out.println("Robot is not working");
		}
	}

}
