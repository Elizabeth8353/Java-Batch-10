package com.syntax.class04;

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner is a class that lives in JRE since our program is in Src we need to imported
				//Shortcut = mac->cmd+shift+o  windows= ctrl+shift+o
				
				
		// we were entering manually 
				String name="Sergio";
				System.out.println("Hello "+name);
				
				Scanner scan=new Scanner(System.in);//Creating Scanner
				
				System.out.println("Please enter your name");
				
				String name1=scan.nextLine();//capturing the name
				
				System.out.println("Hey "+name1);
				
		//Capturing int value
				System.out.println("Please enter your age ");
				int age=scan.nextInt();// capturing int
				System.out.println("your age is "+age);
				
				
				
				
	}

}
