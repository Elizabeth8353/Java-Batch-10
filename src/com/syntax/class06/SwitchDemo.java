package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=5;
		
		if(day==1) {
			System.out.println("today is monday");
		}else if (day==2) {
			System.out.println("today is tuesday");
		}else if(day==3) {
			System.out.println("today is wednesday");
		}else if(day==4) {
			System.out.println("today is thursday");
		}else if(day==5) {
			System.out.println("today is friday");
		}else if (day==6) {
			System.out.println("today is saturday");
		}else if (day==7) {
			System.out.println("today is sunday");
		}else {
			System.out.println(" NOT day of a week");
		}
		
		System.out.println("========Using Switch======================================================");
		//switch is a value based statement. If find matching value case jumps right away 
		//switch is like elevator
		/*
		 * In switch remember :
		 * 1.variable type and case must be same data type
		 * 2.always use break 
		 * 3.No relational operators allowed
		 */
		String dayName;
		
		switch(day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:
				dayName="invalid";
				break;
		
		}
	}

}
