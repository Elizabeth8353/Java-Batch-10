package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		// when one condition has a dependency on another condition
		
		Scanner scan;
		boolean visa;
		int years;
		
		scan=new Scanner(System.in);
		System.out.println("Hey did you get your visa");
		visa=scan.nextBoolean();
		//If you want to say yes you need to say Yes use String
		//visa=scan.next();
		
		if(visa) {
			System.out.println("congrats!! how long is the visa for?");
			years=scan.nextInt();
			if(years>1) {
				System.out.println("that is awsome");
			}else {
				System.out.println("you will have to go back in 1 year");
			}
		}
		
		System.out.println("---------------------------");
		

	}

}
