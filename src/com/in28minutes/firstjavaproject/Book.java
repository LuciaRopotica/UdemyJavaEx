package com.in28minutes.firstjavaproject;

public class Book {

	private int noOfCopies;

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies + howMuch;
	}

	public void decreaseNoOfCopies(int howMuch) {
		if (this.noOfCopies - howMuch > 0) {
			this.noOfCopies = this.noOfCopies - howMuch;
		}

	}
}
