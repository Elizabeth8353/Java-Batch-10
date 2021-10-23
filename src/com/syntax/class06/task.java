package com.syntax.class06;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		/*
		 * write a program to ask user to enter value for sale: yes or no 
		 * if their is a no sale -> you are not going for shoping 
		 * if there is a sale ask user for the item and price of the item 
		 * Based on the price you have to calculate the price of the item after the disc
		 * if price is less than $20->apply 10%
		 * if price is between $20 &100-->20%
		 * if price between $100 and $500 -> 30%
		 * otherwise apply 50%
		 * 
		 */
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Is there a sale? Yes or No");
		String sale= scan.next();
		double disc=0.0;
		String item;
		double price=0.0, finalPrice=0.0;

		if (!sale.equalsIgnoreCase("yes")) {
			System.out.println("I'm not going shopping");
		} else {
			System.out.println("Do you have an item?");
			item = scan.next();
			System.out.println("What is the price of your item");
			price = scan.nextDouble();
		
		if (price < 20) {
			disc = price * .10;
			finalPrice = price - disc;
		} else if (price >= 20&& price < 100) {
			disc = price * .20;
			finalPrice = price - disc;
		} else if (price >= 100 && price < 500) {
			disc = price * .30;
			finalPrice = price - disc;
		} else if(price>500){
			disc = price * .50;
			finalPrice = price - disc;
		}
		System.out.println("You are buying " + item + " the price is " + price + " your discount is " + disc
				+ " your final price is " + finalPrice);
		}

	}

}
