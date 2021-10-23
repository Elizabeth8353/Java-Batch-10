package com.syntax.notes;

public class LogicalOperators {

	public static void main(String[] args) {
		// When ever we have to 2 conditions and at the same better to use && operator
		//if checking == or < > then you can use || but if you use > < you can use &&
		
		
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==1||i==2) {
					if(j==1||j==2) {
				System.out.print(" ");
					}else {
					System.out.print(j);
					}
				}else {
					System.out.print(j);
				}
				//System.out.print(j);
			}
			System.out.println();
		}

	}

}
