package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean understandJava = true;
		boolean enjoy = true;

		if (understandJava && enjoy) {
			System.out.println("that is awsome");
		} else {
			System.out.println("please try to spend time with java");
		}

		/*
		 * declare a number if number is
		 */
		System.out.println(
				"================================================================================================");
		int num = -1;
		if (num > 0) {

			if (num >=0&& num < 10) {// if we enter a negative number will go to else since if is false remember always one block executes
				System.out.println("number is small");//since all if's were false with -1 will go to else block
			} else if (num > 10 && num < 100) {
				System.out.println("number is medium");
			} else if (num > 100 && num < 1000) {
				System.out.println("number is large");
			} else {//the only way to not have the negative num go to else is adding elseif(num>1000)
				System.out.println("number is huge");
			}
		} else {
			System.out.println("Number is either 0 or negative");
	   }
	}

}
