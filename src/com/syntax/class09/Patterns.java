package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=================square=========================================");
for(int r=1;r<=4;r++) {//outerloop iterates through our rows =4
	for(int c=1;c<=5;c++) {//iterates through our columns prints 5 *****
		System.out.print("*");
	}
	System.out.println();//this creates new line for line 9 prints ***** and moves our curser for our next iteration
}
System.out.println("=====================number square====================================");
for(int r=1;r<5;r++) {
	for(int c=1;c<=5;c++) {
		System.out.print(c);
	}
	System.out.println();
}
System.out.println("=====================reverse num=================================");
for(int r=1;r<=5;r++) {
	for(int c=6;c>=1;c--) {
		System.out.print(c);
	}
	System.out.println();
}
System.out.println("===================================================================");
for(int r=1;r<=5;r++) {
	for(int c=1;c<=5;c++) {
		System.out.print(r);
	}
	System.out.println();
}
System.out.println("============================triangle====================================");
for(int r=7;r>=0;r--) {
	for(int c=0;c<=r;c++) {
		System.out.print("*");
	}
	System.out.println();
}

for(int r=2;r<8;r++) {
	for(int c=1;c<=r;c++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
