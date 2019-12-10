package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	synchronized public void incrementI() {

		lockForI.lock();// Get Lock For I
		i++;
		lockForI.unlock();
		// Release Lock For I

	}


	synchronized public void incrementJ() {
		lockForJ.lock();// Get Lock For j
		j++;
		lockForJ.unlock();
		// Release Lock
	}

}
