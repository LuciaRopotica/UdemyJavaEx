package com.in28minutes.firstjavaproject;

//adjust speed and gears
//We would want to create a few objects and play with them
//Understand concept of Class, Object, State, Behavior
//Understand basics of Encapsulation and Abstraction

public class MotorBike {
	// state
	private int speed;// member variable

	MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Bike started");

	}

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;

	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;

	}

	public void decreaseSpeed(int howMuch) {
		if (this.speed - howMuch > 0) {
			this.speed = this.speed - howMuch;
		}
	}
}
