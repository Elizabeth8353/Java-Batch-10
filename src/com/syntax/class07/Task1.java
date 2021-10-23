package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		// Print from 1 to 100
int i=1;
while(i<=100) {
	System.out.print(i+"\t");
	i++;
}
System.out.println("============================");
//print 100 to 1
int b=100;
while(b>=1) {
	System.out.print(b+"\t");
	b--;
}
System.out.println("===============================");
//Print even numbers from 20 to 100
int e=20;
while(e<=100) {
	System.out.print(e+"\t");
	e+=2;
}
System.out.println("=================================");
//Odd 100 to 1
int o=100;
while(o>=1) {
	if(o%2!=0) {
		System.out.println(o);
	}
	o--;
}
	}

}

