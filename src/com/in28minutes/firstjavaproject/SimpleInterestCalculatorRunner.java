package com.in28minutes.firstjavaproject;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {

		//Total Amount = principal +principal*interest*noOfYears;

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue =
				calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
