package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// Nested if your first if must be true to enter second if and to enter second
		// if also must be true to enter
		// the inner if has a dependency on outter if
		// the outer if must pass in order to enter inner if

		boolean vaccine = !false;// the ! will make it true
		boolean secDose = false;

		if (vaccine!=false) { //vaccine is true != false which is true bc true is not equal to false
			System.out.println("Lets check how many doses you got");// will execute if true if not none will execute
																	// even if inner if is true
			if (secDose) {
				System.out.println("you are fully vaccinated ");// will execute if outter if true and if inner if true
			} else {
				System.out.println("you will need to get 2nd dose");
			}//exit point from inner if 
			System.out.println("end of outter if");
		} else {
			System.out.println("end of block");
		}

		System.out.println(" end of code ");
		System.out.println("----------------------------AntherWayOfNEstedIF");

		int day = 13;
		boolean isFriday = true;

		if (isFriday) {
			System.out.println("I am going to watch movie");
			if (day != 13) {
				System.out.println("yey!! I'm am watching scary movie");
			} else {// this else belongs to line35 will execute if inner if false
				System.out.println("I am watching what ever is popular");
			}
		} else {// belongs to outter if line33
			System.out.println("I am going to study ");
		}
		System.out.println("end of code");

	}

}
