package com.syntax.notes;

public class Patterns {

	public static void main(String[] args) {
		// Square
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
			}
			System.out.println();
		}
		System.out.println("===============Another Square==================================");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if((i==1&&j==1)||(i==2&&j==1)||(i==1&&j==2)||(i==2&&j==2)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
