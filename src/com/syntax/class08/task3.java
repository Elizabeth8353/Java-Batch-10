package com.syntax.class08;

import java.util.Scanner;

public class task3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String item;
	int price;
	int money;
	int reminder;
	int sum=0;
	
	System.out.println("please enter the item you would like to buy");
	item=scan.next();
	System.out.println("Please enter the price of the "+item);
	price=scan.nextInt();
	
	do {
		System.out.println("Please pay for the "+item);
		money=scan.nextInt();
		sum+=money;
		if(sum<price) {
			reminder=price-sum;
			System.out.println("you still owe "+reminder);
		}else if(sum>price) {
			reminder=sum-price;
			System.out.println("here is your change"+reminder);
			System.out.println("Thank you for your purchase");
			break;
		}else {
			System.out.println("thank you for your purchase");
		}
	}while(sum!=price);
	
	
	
}
}
