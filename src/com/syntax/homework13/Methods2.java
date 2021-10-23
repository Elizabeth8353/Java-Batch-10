package com.syntax.homework13;

public class Methods2 {
	//Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
	//Example:  createEmail(John, Snow, gmail) -> johnsnow@gmail.com or 
	
	String createEmail(String name,String lastName,String emailType) {
		return name+lastName+emailType;
	}
	
	//Write a method to return whether given number is prime or not?

	int primeOrNot(int num) {
	boolean Prime = false;
	if(num>0) {
	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			Prime = true;
		}
	}
	if (!Prime) {
		System.out.println(num + " is a prime number");
	} else {
		System.out.println(num + " is not a prime number");
	}
	}else {
		System.out.println(num+" Not prime number");
	}
	return num;
	
	}
	
	//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
	//score > 90 - A score >80 - B score >70 - C score > 50 - D anything else - F
	int getGrade(int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score>=70&&score<=90) {
			grade='B';
		}else if(score>=50&&score<=70) {
			grade='C';
		}else {
			grade='F';
		}
		System.out.println(grade);
		return score;
	}
	
	
}
