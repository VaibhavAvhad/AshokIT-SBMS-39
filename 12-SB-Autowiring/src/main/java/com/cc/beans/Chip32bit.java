package com.cc.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("chip32")
public class Chip32bit implements IChip {

	public Chip32bit() {
		System.out.println("Chip32bit :: Constructor");
	}

	@Override
	public boolean process() {
		System.out.println("Chip32bit processing started");
		return false;
	}

}
