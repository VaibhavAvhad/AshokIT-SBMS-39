package com.ashokit;

public class TestClass {
	public static void main(String[] args) {
		// The process of injecting dependent obj into target obj is called as
		// dependency injection (DI).

		// Field Injection (not recommended)
		RestaurantService restaurant1 = new RestaurantService();
		restaurant1.collectBill(10);// NullPointerException if not initialized

		// RestaurantService service1 = new RestaurantService();
		// service1.payment = new DebitCardPayment(); // FI
		// service1.collectBill(20);

		/******************************************************************/

		// Injecting dependent obj into target class obj using target class constructor
		// is called as CI.

		RestaurantService restaurant2 = new RestaurantService(new CreditCardPayment());
		restaurant2.collectBill(80);

		/******************************************************************/

		// Injecting dependent obj into target class obj using target class setter
		// method is called as SI.

		RestaurantService restaurant3 = new RestaurantService();
		restaurant3.setPayment(new DebitCardPayment());
		restaurant3.collectBill(32);

	}

}
