package com.in28minutes.concurrency;

public class Counter {

	private int i = 0;

	public int getI() {
		return i;
	}

	synchronized public void increment() {
		i++; // 15
		// get i 15 15
		// increment
		// set i 16
	}

}
