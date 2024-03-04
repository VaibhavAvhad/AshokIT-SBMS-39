package com.ashokit;

public class CreditCardPayment implements Ipayment {

	@Override
	public boolean payBill(double amt) {
		System.out.println("Inside a credit card payment");
		return true;
	}

}
