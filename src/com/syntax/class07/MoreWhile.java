package com.syntax.class07;

import java.util.Scanner;

public class MoreWhile {
	public static void main(String[] args) {
/*
 * Ask name age from a user 3 times
 * print name+age
 */
		
		Scanner scan; 
		String name;
		int age;
		scan=new Scanner(System.in);
		int i=0;
		while(i<3) {
		System.out.println("Please enter your name ");
		name=scan.next();
		System.out.println("Please enter age");
		age=scan.nextInt();
		System.out.println(name+"is"+ age +"years old");
		i++;
		}
			
		
}
}
