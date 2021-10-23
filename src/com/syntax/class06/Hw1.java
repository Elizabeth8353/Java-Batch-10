package com.syntax.class06;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		String country=scan.next();
		String language;
		
		switch(country) {
		case "France":
			language="French";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "Brazil":
			language="Portugese";
			break;
		case "China":
			language="Chinese";
		    break;
		default:
			language=" ";
			System.out.println("Invalid");
		}
		if(!language.equals(" ")) {
		System.out.println("In "+country+" they speak "+language);
		}
		System.out.println("=====================Else if ========================");
		if(country.equals("France")) {
			language="French";
		}else if(country.equals("Spain")){
			language="Spanish";
		}else if(country.equals("Brazil")){
			language="Portugese";
		}else if(country.equals("China")) {
			language="Chinese";
		}else {
			System.out.println("Invalid");
		}
		}

	}


