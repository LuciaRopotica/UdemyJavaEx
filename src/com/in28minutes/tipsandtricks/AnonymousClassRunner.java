package com.in28minutes.tipsandtricks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return Integer.compare(str1.length(), str2.length());
	}

}
 */
public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(List.of("Ant", "Elephant", "Cat", "Ball"));
		Comparator<String> lengthComparator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		};
		Collections.sort(animals, lengthComparator);

		System.out.println(animals);

	}

}
