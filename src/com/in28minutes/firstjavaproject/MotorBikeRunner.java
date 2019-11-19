package com.in28minutes.firstjavaproject;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.start();
		honda.start();

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		ducati.decreaseSpeed(20);
		honda.decreaseSpeed(30);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
