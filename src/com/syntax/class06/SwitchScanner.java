package com.syntax.class06;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		/*
		 * I want to ask where you are from ?
		 * based on the country we will denfine traditional?
		 */
Scanner in;
String country,traditionalFood;

in=new Scanner(System.in);
System.out.println("Hey, where are you from?");
country=in.nextLine();

switch(country) {

case "USA":
	traditionalFood="burger";
	break;
case "Afganistan":
	traditionalFood="qabeli palaw";
	break;
case "Peru":
	traditionalFood="ceviche";
	break;
case "italy":
	traditionalFood="pasta";
	break;
case "tajikistan":
	traditionalFood="kurruto";
	break;
case "Ukrain":
	traditionalFood="borsch";
	break;
default:
	traditionalFood="invalid";

}
System.out.println("Your traditional food"+traditionalFood);
	}

}
