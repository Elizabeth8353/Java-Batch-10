package com.syntax.class07;

public class TodaysHW1 {

	public static void main(String[] args) {
		
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
