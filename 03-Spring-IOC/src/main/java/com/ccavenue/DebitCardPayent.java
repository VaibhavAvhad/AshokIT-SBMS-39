package com.ccavenue;

public class DebitCardPayent implements Ipayment {

	public DebitCardPayent() {
		System.out.println("DebitCardPayent : constructor");
	}

	@Override
	public boolean payBill(double amt) {
		System.out.println("Inside debit card Payment");
		return true;
	}

}
