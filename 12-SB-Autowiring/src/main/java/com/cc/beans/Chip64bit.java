package com.cc.beans;

import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64bit implements IChip {

	public Chip64bit() {
		System.out.println("Chip64bit :: Constructor");
	}
	
	@Override
	public boolean process() {
		System.out.println("chip64bit processing started");
		return false;
	}

}
