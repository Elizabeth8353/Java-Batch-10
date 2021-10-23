package com.syntax.class04;

public class SeparateIfStatements {

	public static void main(String[] args) {
		/*
		 * First program should check if rate is higher than 4.5 user will not buy a house, 
		 * Otherwise user will consider buying. Once decide to buy if price higher then 
		 * 20000 will get a loan if less will pay cash
		 */
		
		double rate=4.6;
		int price=10000;
		//will work if rate is less then 4.5 always but not if higher logic will not make sense 
		// like this scenerio which is why best to Nest only if you want to buy then further check and 
		//only then check price this is example why separate programs not recomended 
		
		if(rate<4.5) {
			System.out.println("will buy a house");
		}else {
			System.out.println("will Not buy a house");//this will print
		}
		
		if(price>20000) {
			System.out.println("I will get a loan");
		}else {
			System.out.println("I will pay cash");//this will print 
		}
		System.out.println("========================COrrect way========================================");
		
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

	}

}
