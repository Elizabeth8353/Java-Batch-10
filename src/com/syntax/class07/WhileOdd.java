package com.syntax.class07;

public class WhileOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<21) {
			System.out.println(n);
			n+=2;
	}
		System.out.println("=================================================");
		
		while(n<21) {
			if(n%2!=0) {
				System.out.println(n);
			}
			n++;
		}
	}

}
