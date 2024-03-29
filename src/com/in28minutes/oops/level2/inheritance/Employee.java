package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employerName;
	}

	public void setEmployer(String employer) {
		this.employerName = employer;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}



	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
	}
}
