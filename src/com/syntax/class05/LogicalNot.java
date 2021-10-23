package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// it takes out condition and reverts its condition
		
		boolean b=!true;
		boolean a=!false;
		
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("================IfCondition======================================");
		boolean hungry=true;
		
		if(!hungry) {
			System.out.println("Im not hungry");
		}
	System.out.println("===================Another example==========================");
		boolean hot=false;
		
		if(!hot) {
			System.out.println("I will go for walk");
		}
		System.out.println("=================example with string=======================");
		String name="Hanza";
		if(!name.equals("Stephanie")) {
			System.out.println("Then I'm not looking for you");
		}
		
		System.out.println("End of class");

	}

}
