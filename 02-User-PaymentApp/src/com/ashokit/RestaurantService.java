
package com.ashokit;
//Target class
public class RestaurantService {
	
	Ipayment payment;//interface variable
	
	 public RestaurantService() {
		 
	 }
	
	public RestaurantService(Ipayment payment) {
		System.out.println("inside a RestaurantService Constructor ");
		this.payment=payment;
	}
	
	public void setPayment(Ipayment payment) {
		System.out.println("inside a RestaurantService Setter Method ");
		this.payment=payment;
	}
	
	public void collectBill(double amt) {
		boolean status=payment.payBill(amt);
		if (status) {
			System.out.println("Payment Success ....Thank You");
		}
		else {
			System.out.println("Payment Fail");
		}
	}
	

}
