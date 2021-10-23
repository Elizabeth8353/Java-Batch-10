package com.syntax.class14;

public class Task1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task1 task1=new Task1();
task1.printGrater(10, 50);
task1.printOdd(5);
task1.printHello("USA");
task1.printHello("rion");
String email=task1.createEmail("eli"," val", "gmail.com");
System.out.println(email);
boolean b=task1.isPrime(0);
System.out.println(b);
System.out.println(task1.getGrade(50.75));
	}

}
