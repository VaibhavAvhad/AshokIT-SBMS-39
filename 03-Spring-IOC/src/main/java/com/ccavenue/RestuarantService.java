package com.ccavenue;

public class RestuarantService {

	private Ipayment payment;
	
	public RestuarantService() {
		System.out.println("RestuarantService constructor");
	}
	
	public RestuarantService(Ipayment payment) {
		System.out.println("RestuarantService 1 param constructor");
		this.payment=payment;
	}
	
	public void setPayment(Ipayment payment) {
		System.out.println("inside a setter method of RestuarantService");
		this.payment=payment;
	}

	public void paymentDetails(double amt) {
		boolean service = payment.payBill(amt);
		if (service) {
			System.out.println("Payment Successful");
			System.out.println(amt);
		} else {
			System.out.println("Payment Fail please try Again");
		}

	}

}
