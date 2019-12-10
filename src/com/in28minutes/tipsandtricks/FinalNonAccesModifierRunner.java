package com.in28minutes.tipsandtricks;

final class FinalClass {

}

//class SomeClass extends FinalClass {
//}

class SomeClass {
	final public void doSomething() {
	}

	public void doSomethingElse(final int arg) {
		// arg = 6
	}

	class ExtendingClass extends SomeClass {
		// public void doSomething() {}
	}

	public static class FinalNonAccesModifierRunner {

		public static void main(String[] args) {
			final int i = 5;
			// i = 7;

		}

	}
}
