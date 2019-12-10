package com.in28minutes.tipsandtricks;

public class MethodAccesRunnerInsideSamePackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
		exampleClass.publicMethod();

	}

}
