package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		/* Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		String[] cars= {"porche","tesla","mustang","jeep"};
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("============================task 2=================================");
		/*Create an array of animals and store 6 elements into it. Using 2 different
		 *  loops print all elements from the array.
		 */
		String[] animals=new String[6];
		animals[0]="lion";
		animals[1]="Dog";
		animals[2]="Cat";
		animals[3]="Bear";
		animals[4]="Bird";
		animals[5]="fish";
		
		int i=0;
		while(i<animals.length) {
			System.out.println(animals[i]);
			i++;
		}
		for(String animal:animals)  {
			System.out.println(animal);
		}
		
	System.out.println("==================task3==============================");	
	/*
	 * Create an array to store double values and then print those in reverse order
	 */
	double[] num= {2.0,4.0,3.0,6.0};
	for(int x=num.length-1;x>=0;x--) {
		System.out.println(num[x]);
	}
	System.out.println("====================task4================================");
		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		int[] nums= {2,4,5,6,7};
		
		int sum=0;
		for(int num1:nums) {
			sum+=num1;
		}
		System.out.println(sum);
		System.out.println("========================task5=======================");
		/*From an array of integer elements find the largest number.
		 */
		int max=0;
		int y=0;
		while(y< nums.length) {
		    if (nums[y] > max) {
		        max = nums[y];
		    }
		     y++;
		}
		System.out.println("the largest number is "+max);
		
		

	}

}
