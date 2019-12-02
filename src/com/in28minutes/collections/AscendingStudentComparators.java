package com.in28minutes.collections;

import java.util.Comparator;

public class AscendingStudentComparators implements Comparator<Student1> {
	@Override
	public int compare(Student1 student1, Student1 student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}