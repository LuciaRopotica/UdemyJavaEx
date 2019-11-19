package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Hyderabad", "500035");
		Customer customer = new Customer("Ranga", homeAddress);

		Address workAddress = new Address("line1 for work", "Hyderabad", "500035");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}

}
