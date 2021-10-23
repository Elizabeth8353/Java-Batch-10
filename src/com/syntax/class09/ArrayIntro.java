package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// collection that can hold multiple value from the same data type
		//stored based on indexes
		
		int i=0; //simple variable stores 1 value at a time
		
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[2]);
		
		//I want to store week days
		
		String[] days=new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sundays";
		days[6]="Funday";//Reassign
		
		System.out.println(days[5]+"  "+days[6]);
		
		boolean[] boo=new boolean[3];
		boo[0]=true;
		boo[1]=false;
		boo[2]=true;
		
		if(boo[0]) {
			System.out.println("boo");
		}
		
		
		
		
		
		
		

	}

}
