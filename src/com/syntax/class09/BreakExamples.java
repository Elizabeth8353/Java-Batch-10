package com.syntax.class09;

public class BreakExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=3;i++) {
			System.out.println("outer loop "+i);
			for(int j=0;j<3;j++) {
				System.out.println("inner loop "+j);
				break;//break will just break from this loop not the outer one
			}
			System.out.println("===============================");
		}
		System.out.println("======================Brake=========================================");
		for(int i=1;i<3; i++) {
			System.out.println("outter for loop");
			
		}

	}

}
