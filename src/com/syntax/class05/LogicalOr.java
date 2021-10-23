package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * define a day 
 * if day is monday or friday ->No class
 * if day is tuesday or wednesday -> manual
 * if day is thursday -> review class
 * if day is saturday or sunday->java class
 */
		
		String day="Monday";
		
		if(day.equals("Monday")|| day.equals("Friday")) {
			System.out.println("We have no class at syntax");
		} if(day.equals("Tuesday")||day.equals("Wednesday")) {
			System.out.println("Today is manual class");
		} if(day.equals("Thursday")) {
			System.out.println("Review class");
		} if(day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("Java Class");
		}else {
			System.out.println("Invalid day");
		}
	}

}
