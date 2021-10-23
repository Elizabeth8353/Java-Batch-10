package com.syntax.review03;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * Logical operatorsin Java are && || !
		 * We can use these operators to put multiple condition in if block
		 * for || as soon as one condition is true it will evalute condition as true
		 */
		
		String day="Monday";
		
		//day.equals("sunday")  most recomended but same as line 13
		if("sunday".equals(day)) {// we can  enter if condition this way too
			System.out.println("It's weekend");
		}else if(day.equals("saturday")){
			System.out.println("its weekend");
		}else {
			System.out.println("it's weekday");
		}
		
		int number=10;
		if(number==10) {
			System.out.println("number is 10");
		}
		if(10==number) {
			System.out.println("number is 10");
		}
		
		if("sat".equals("sat")) {
			System.out.println("hi");
		}
		System.out.println("==========================================================");
		// diference || less chances of errors it will be true as soon as one condition is true
		// but using only| it will check only first true condition and stop
		if(day.equals("Sunday")|day.equals("Saturday")) {
			System.out.println("its weekend ");
		}else {
			System.out.println("its weekday");
		}
		
		if(day.equals("saturday"))
		System.out.println("It's not saturday only one line is limited to this if ");
		System.out.println("its not saturday but this is an unconditional statement");// this line is outside of line 43 scope
		
		
		

	}

}
