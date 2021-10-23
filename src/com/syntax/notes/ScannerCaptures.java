package com.syntax.notes;

import java.util.Scanner;

public class ScannerCaptures {

	public static void main(String[] args) {
		//shorcut to import scanner  ( ctrl + shift + o )
		
		Scanner scan=new Scanner(System.in);

		//to capture entire sentence 
		String sentence=scan.nextLine();
		System.out.println(sentence);
		
		//to capture a number
		int num=scan.nextInt();
		System.out.println(num);
		
		//to capture a double
		double d=scan.nextDouble();
		System.out.println(d);
		
		//to capture single character
		char singleCharacter=scan.next().charAt(0);// the number inside charAt(index) index of the captured value
		System.out.println(singleCharacter);
	}

}
