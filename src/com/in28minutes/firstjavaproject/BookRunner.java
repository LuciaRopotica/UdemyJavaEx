package com.in28minutes.firstjavaproject;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(2000);
		Book effectiveJava = new Book(5000);
		Book cleanCode = new Book(7000);

		artOfComputerProgramming.setNoOfCopies(20);

		artOfComputerProgramming.increaseNoOfCopies(5);
		effectiveJava.increaseNoOfCopies(3);
		cleanCode.increaseNoOfCopies(7);

		artOfComputerProgramming.decreaseNoOfCopies(50);
		effectiveJava.decreaseNoOfCopies(30);
		cleanCode.decreaseNoOfCopies(70);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
