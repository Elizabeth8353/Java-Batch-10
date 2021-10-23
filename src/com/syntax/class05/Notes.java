package com.syntax.class05;

import java.util.Scanner;

public class Notes {
/*
 * Scanner- takes input from a user 
 * 
 * to use Scanner we need to imporst it
 * 
 * Inside a class we need a main method
 * 
 * to only declare Scanner
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner scan;//declaring
		scan=new Scanner(System.in);//initializing
		
		char c=scan.next().charAt(0);// for char in scanner
		
		/*
		 * using nested if
		 * when your first condition needs to pass before the nested condition can pass
		 */
		
		/*
		 * Logical opperators in java  (&& and || or)
		 * &&
		 * logical and &&
		 * true && true= true
		 * false && true= false
		 * 
		 * ||
		 * false||false=false
		 * true ||false=true
		 * true||true=true
		 */
	}
}
