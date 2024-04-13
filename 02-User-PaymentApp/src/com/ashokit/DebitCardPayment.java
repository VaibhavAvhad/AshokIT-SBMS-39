
package com.ashokit;

public class DebitCardPayment implements Ipayment {

	@Override
	public boolean payBill(double amt) {
		System.out.println("inside a debit card payment");
		return true;
	}

}
