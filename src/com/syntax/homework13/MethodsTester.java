package com.syntax.homework13;

public class MethodsTester {

	public static void main(String[] args) {
//task 1
		Methods taskOne=new Methods();
		taskOne.largestNum(50,70);
		
//task 2
		Methods taskTwo=new Methods();
		taskTwo.evenOrOdd(0);
		
//task 3
		Methods taskThree=new Methods();
		String str=taskThree.palindrome("bob");
		System.out.println(str);
		
//task 4
		Methods taskFour=new Methods();
		String hi=taskFour.hello("French");
		System.out.println(hi);

	}

}
