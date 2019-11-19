package com.in28minutes.firstjavaproject;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;

	}

	public boolean isVowel() {
		// a e i o u or A, E, I, O,U
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 122) {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		//Alphabet and is not VOWEL
		//![a,e,i,o,u]
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;

	}

	public static void printLowerCaseAlphabets() {
		// 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		// 'a' to 'z'
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}
}


