package com.syntax.review04;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		System.out.println("hello");
		for (int i=0;i<5;i++) {
			x=i;
			while(x<5) {
				System.out.println(x);
				x++;
			}
			System.out.println("hi");
		}

	}

}
