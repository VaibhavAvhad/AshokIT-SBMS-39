package com.ccavenue;

public class CreditCardPayment implements Ipayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment : constructor");
	}
	

	@Override
	public boolean payBill(double amt) {
		System.out.println("Inside a CreditCardPayment option ");
		return false;
	}

}
