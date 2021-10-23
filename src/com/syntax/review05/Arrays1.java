package com.syntax.review05;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num=new int[5];
		
		for(int i=1;i<5;i++) {
			num[i]=i+1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("=======enhanced for loop=================================================");
		
		for(int nums:num) {
			System.out.print(nums+" ");
		}

	}

}
