package com.syntax.class09;

public class EnhancedAdvance4Loop {

	public static void main(String[] args) {
		/*
		 * Can only be used with arrays or collection
		 */
		String[] cars={"corola","toyota","honda"};
		for(String car:cars) {
			System.out.println(car);
		}
		
		System.out.println("=======================================================================");
		
		int[] num= {100,20,40,10,};
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("==========================================================================");
		
		for(int n:num) {
			System.out.println(n);
		}
		System.out.println("==================retreving backwads=============================");
		for(int i=num.length-1;i>=0;i++) {//in this case use .length-1 if your start num is greater then your end number 
			System.out.println(num[i]);
		}

	}

}
