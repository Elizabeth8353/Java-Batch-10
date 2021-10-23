package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// Ask user to pay for a candy, keep asking user to pay for candy until entered price is not equal to 3
		//if entered value is more than 3 -> please give less money, otherwise please give more money
		// after user got a write amount print "please enjoy your candy"
		
		Scanner scan=new Scanner(System.in);
		int pay;
		System.out.println("Please pay for candy");
		
		do {
			pay=scan.nextInt();
			if(pay<3) {
				System.out.println("Please give more money");
			}else if(pay>3) {
				System.out.println("Please give less money");
			}else {
				System.out.println("enjoy your candy");
			}
		}while(pay!=3);
	//	System.out.println("Please enjoy your candy");
System.out.println("\n===================================2nd HW==============================================================");
// Please find sum of even and odd numbers from 1 to 100
int even=0;
int odd=0;
for(int i=1;i<=100;i++) {
	if(i%2==0) {
	even+=i;
	}else {
		odd+=i;
	}
}
System.out.println("the sum of even are "+even);
System.out.println("the sum of odd are "+odd);

	}

}
