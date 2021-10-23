package com.syntax.class10;

public class TwoDArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] food= {
				{"borch","vareniki","draniki"},
				{"kebabs","palaw","mantu"},
				{"tacos","burrito","queso","salsa"},
				{"pasta","pizza","bread","risotto"}
		};
		
		System.out.println(food.length);
		
		System.out.println(food[2][1]);
		food[3][2]="cheese"; // we are reasining row 3 col1
		System.out.println(food[3][2]);
		int sizeOf1Array=food[0].length;
		System.out.println(sizeOf1Array);
		
		
		for(int i=0;i<food.length;i++) {//total number of rows /arrays
			for(int j=0;j<food[i].length;j++) {//iterate over column/each element from array
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
