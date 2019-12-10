package com.in28minutes.firstjavaproject;

import com.in28minutes.tipsandtricks.ExampleClass;

public class MethodAccesRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
		exampleClass.publicMethod();

	}

}
