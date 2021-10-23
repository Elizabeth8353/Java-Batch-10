package com.syntax.homework13;

public class Method2Tester {

	public static void main(String[] args) {
		
	//task 5
		Methods2 taskFive=new Methods2();
		String str=taskFive.createEmail("eli", "val", "@gmail.com");
		System.out.println(str);
//task6
		Methods2 task6=new Methods2();
		int prime=task6.primeOrNot(5);
		
		
		
//task 7
		Methods2 task7=new Methods2();
		int grade=task7.getGrade(80);
		System.out.println(grade);
		
	}

}
