package com.cc;

public class ATM {

	Ipayment payment;
	
	public ATM() {
		System.out.println("inside a ATM:: Default constructor");
	}
	
	public ATM(Ipayment payment) {
		System.out.println("inside a ATM:: 1 param constructor");

		this.payment = payment;
	}


	public void setPayment(Ipayment payment) {
		System.out.println("inside setter method of ATM class");
		this.payment=payment;
	}
	
	
	public void withdraw() {
		System.out.println("withdraw money successfully");
		payment.print();
	}
	
}
