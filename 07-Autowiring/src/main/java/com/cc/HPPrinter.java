package com.cc;

public class HPPrinter implements Ipayment {

	public HPPrinter() {
		System.out.println("HPPrinter :: constructor");
	}

	@Override
	public void print() {
		System.out.println("Print through HP Printer");

	}

}
