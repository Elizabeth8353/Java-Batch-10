package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {100,2,4,2,1000,6,7,5,20};
		int max=0;
		int y=0;
		while(y< nums.length) {
		    if (nums[y] > max) {
		        max = nums[y];
		    }
		     y++;
		}
		System.out.println("the While largest number is "+max);
		
		System.out.println("=================for enhanced================");
	max=0;
	for(int n:nums) {
		if(n>max) {
			max=n;
		}
	}
	System.out.println("My Enhanced largest is "+max);
	}

}
