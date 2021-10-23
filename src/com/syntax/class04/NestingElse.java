package com.syntax.class04;

public class NestingElse {

	public static void main(String[] args) {
		/*
		 * First program should check if rate is higher than 4.5 user will not buy a house, 
		 * Otherwise user will consider buying. Once decide to buy if price higher then 
		 * 20000 will get a loan if less will pay cash
		 */
double rate=3.5;
int price=2000555;
		if(rate<4.5) {
			System.out.println("I will buy house ");
			if(price>20000) {
				System.out.println("I will get a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}else {
			System.out.println("I will Not buy house");
		}
		System.out.println("===========Nesting ELSE========================");
		
		if(rate>4.5) {
			System.out.println("NOT BUYING HOUSE");
		}else {
			System.out.println("Buying A HOUSE");
			if(price<20000) {
				System.out.println("I'm paying cash");
			}else {
				System.out.println("I'm Getting Loan");
			}
		}
	}

}
