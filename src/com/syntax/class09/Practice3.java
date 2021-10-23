package com.syntax.class09;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4};
System.out.println(arr.length);//4 number of columns 

int[][]arr2= {
		{1,2,3,4},
		{5,6},
		{7,8,9,10}
};
System.out.println(arr2.length);//3 number of rows

// .length counts as human 1 to bla bla bla
System.out.println(arr2[0].length);//4 elements inside 1 array/5columns in 1 row
System.out.println(arr2[1].length);//2 elements in 2array/2 columns in 2 row


	}

}
