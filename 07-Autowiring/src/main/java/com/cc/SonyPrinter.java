package com.cc;

public class SonyPrinter implements Ipayment {

	public SonyPrinter() {
		System.out.println("SonyPrinter :: constructor");
	}

	@Override
	public void print() {
		System.out.println("Print through sony printer");

	}

}
