package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// Used when we know in advance how many times we want to repeat same block of code
		//for(inizilization ; condition; increment/decrement)
		
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
		}
		System.out.println("=======1 to 10=============");
for(int i=1;i<=10;i++) {
	System.out.print(i+" ");
}
System.out.println("\n======20 to 10=====================");
for(int i=20;i>=10;i--) {
	System.out.print(i+" ");
}
System.out.println("\n============even 10 to 100=================");
for(int i=10; i<=100;i+=2) {
	System.out.print(i+" ");
}
System.out.println("\n=================even 10 to 100 if=========");
for(int i=10;i<=100;i++) {
	if(i%2==0) {
		System.out.print(i+" ");
	}
}
	System.out.println("\n================");
	for(int i=1;i<=50;i+=10) {
		System.out.print(i+" ");
	}

	}

}
