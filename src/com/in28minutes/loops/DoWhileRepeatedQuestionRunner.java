package com.in28minutes.loops;

import java.util.Scanner;



public class DoWhileRepeatedQuestionRunner {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		int number = -1;

		do {
			if (number != -1) {
				System.out.println("Cube is " + (number * number * number));
			}
			System.out.print("Enter a number ");
			number = scanner.nextInt();
		} while (number >= 0);
		System.out.println("Thank You! Have Fun!");
	}



}