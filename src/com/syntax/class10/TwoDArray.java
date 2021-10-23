package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		 int [] [] b=new int [3][4];
		 //first row and col
		 b[0][0]=11;
		 b[0][1]=12;
		 b[0][2]=13;
		 b[0][3]=14;
		 
		 //second row and col
		 b[1][0]=20;
		 b[1][1]=30;
		 b[1][2]=40;
		 b[1][3]=50;
		 
		 //third row and col/element
		 b[2][0]=100;
		 b[2][1]=200;
		 b[2][2]=300;
		 b[2][3]=400;
		 
		 System.out.println(b[0][3]);
		 
		 System.out.println("=======================Another way===================================");
		 
		 int[][] myArray= {
				 {11,12,13,14,15},//1 array
				 {20,30,40},//2 array
				 {100,200,300,400},
		 };
		 
		 for(int r=0;r<myArray.length;r++) {
			 for(int c=0;c<myArray[r].length;c++) {
				 System.out.print(myArray[r][c]+" ");
			 }
			 System.out.println();
		 }
		 

	}

}
