package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student1> students = List.of(new Student1(1, "Ranga"), new Student1(100, "Adam"),
				new Student1(2, "Eve"));// aici
		// nu
		// inteleg
		// de
		// ce
		// este<Student>,
		// nu
		// ar
		// trebui
		// sa
		// fie
		// type:
		// String?
		List<Student1> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		System.out.println("Desc" + studentsAl);

		Collections.sort(studentsAl, new AscendingStudentComparators());
		System.out.println("AscendingStudentComparator" + studentsAl);

	}

}


