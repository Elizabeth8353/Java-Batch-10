package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: if user is born in June, July or August -> season =“Summer”.
           At the end of the program we should see output as “You were born is season ______“.
		 */
Scanner scan;
String season=null;
String month;
scan=new Scanner(System.in);
System.out.println("Please enter your birth month");
month=scan.next();

if(month.equalsIgnoreCase("january")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("December")){
	season="Winter";
}else if(month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("May")){
	season="Spring";
}else if(month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("August")) {
	season="Summer";
}else if(month.equalsIgnoreCase("september")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")) {
	season="Autumn";
}else {
	System.out.println("Invalid month");
}
System.out.println("You were born is season "+season);


	}

}
