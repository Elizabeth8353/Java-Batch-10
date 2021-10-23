package com.syntax.review05;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  * *****
  * **
  * **
  * *****
  */
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				if(i==1||i==2) {
					
					if(j>1) {
						continue;
					}
					
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============================================================================");
		/*
		 * ****
		 * *  *
		 * ****
		 */
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				if(i==1) {
					if(j==1||j==2) {
						continue;
					}
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
