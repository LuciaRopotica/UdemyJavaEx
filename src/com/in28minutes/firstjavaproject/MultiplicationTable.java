package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	//5*1 = 5
	void print() {
		print(7);
	}

	void print(int table) {
		print(table, 1, 10);
		for(int i=1; i<=10; i++) {

		}
	}
	void print(int table, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();
		}
	}

}

