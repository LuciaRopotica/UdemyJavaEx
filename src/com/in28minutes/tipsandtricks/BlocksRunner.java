package com.in28minutes.tipsandtricks;

public class BlocksRunner {
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	public static void main(String[] args) {
		if (3 > 2) {
			System.out.println(Integer.MIN_VALUE);
			System.out.println("Seconds in a day are: " + SECONDS_IN_DAY);
		}

	}
}