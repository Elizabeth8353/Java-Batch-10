package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
           short (under 60 inch)
           medium(between 60 -72 inch)
           tall (over 72 inch)
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter hight in inches");
int height=scan.nextInt();

if(height<60) {
	System.out.println("You are short");
}else if(height>=60&&height<72) {
	System.out.println("You are medium");
}else {
	System.out.println("You are tall");
}

System.out.println("==========Task 2=========================");
/*
 * Write a program that will print whether it is a weekend or weekday. If any day 
 * from 1-5 ->output “It is a weekday”, anyday from 6-7 -> output “It is a weekend”, 
 * any other day -> output “Invalid day”
 */
System.out.println("enter a day");
int day=scan.nextInt();
if(day>=1&&day<=5) {
	System.out.println("It's the Weekday");
}else if (day>=6&&day<=7) {
	System.out.println("Weekend here i Come!!");
}else {
	System.out.println("invalid day");
}

System.out.println("==========task 2 using OR====================");

System.out.println("Please enter 1-7 for the days");
int day1 = scan.nextInt();
if(day1 == 1 || day1 == 2 || day1 == 3 || day1 == 4 || day1 == 5) {
	System.out.println("It is a weekday");
}else if (day1 == 6 || day1 == 7) {
	System.out.println("It is a weekend");
}else{
	System.out.println("Invalid day");
}
System.out.println("=========task2 and another OR AND &&");
System.out.println("Please ented a day for third time");
int day3=scan.nextInt();
if(day3>=1&&day3<6) {
	System.out.println("It's a weekday");
}else if(day3==6||day3==7) {
	System.out.println("It's a weekend");
}else {
	System.out.println("Invalid day");
}
}

	}


