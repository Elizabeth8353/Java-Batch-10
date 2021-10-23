package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		 *  and determine the grade based on the following rules: 
           if the average score >=90 -> grade=A
           if the average score >= 70 and <90 -> grade=B
           if the average score>=50 and <70 -> grade=C
           if the average score<50 -> grade=F
		 */
Scanner scan;
double quiz;
double midTerm;
double finalScore;
double avg;
char grade;

scan=new Scanner(System.in);

System.out.println("Please enter your quiz, mid term and final score");
quiz=scan.nextDouble();
midTerm=scan.nextDouble();
finalScore=scan.nextDouble();
avg=(quiz+midTerm+finalScore)/3;

if(avg>=90) {
	grade='A';
}else if(avg>=70&&avg<=90) {
	grade='B';
}else if(avg>=50&&avg<=70) {
	grade='C';
}else {
	grade='F';
}
System.out.println("Your final score is "+avg+" your grade is "+grade);





	}

}
