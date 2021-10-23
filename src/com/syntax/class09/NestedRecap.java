package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++) {
	System.out.println("loop i");
	for(int j=1;j<4;j++) {
		System.out.println("loop j");
	}
}

System.out.println("===========Multiplication Table==========================");
for(int i=0;i<10;i++) {
	for (int j=0;j<10;j++) {
		System.out.println(i+"X"+j+"="+i*j);
	}
	System.out.println();
}
	}

}
