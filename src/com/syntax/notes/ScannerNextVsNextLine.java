package com.syntax.notes;

import java.util.Scanner;

public class ScannerNextVsNextLine {

	public static void main(String[] args) {
		// Ctrl+shit+o= to import scanner
/*
 * for Scanner if you enter a int and then a string 
 * if you ask for a primitive and then for next line 
 * 
 */
	int i=10; // int i=declaring  int i=10;=initilizing i  hardcoding
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter any entire texts using nextLine");
	//nextLine captures texts and spaces entire texts with all spaces your want 
	
	String texts=scan.nextLine();//scan.nextLine();--> captures your input from console,
								//once you enter text you must hit enter
	
	System.out.println("texts you have enter is = "+texts); //printing what your scan captured
	
	System.out.println("text captures one word using next");
	String OneText=scan.next(); // captures only one word till space nothing more
	System.out.println("text only one word = "+OneText);
	
	System.out.println("enter again nextLine");
	String texts2=scan.nextLine();// cannot use nextLine and next after and next Line THIS WILL NOT CAPTURE  
	System.out.println("next line #2 = "+texts2);//CURSER IS STILL AT OneText
	System.out.println(texts+" "+OneText+" "+texts2);
	
		System.out.println("==================nextInt and then nextLN=================================");
		//anytime when using next curser is let in the text 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int num=input.nextInt(); // curser stays after the num 
		System.out.println("enter word");
		//String word1=input.nextLine(); Will not capture text because 
		System.out.println("int ="+"word1 = ");
		
		//next captures num and leaves the curser next to num and since curser stays next to num and 
		//curser did not move to next line when we use nextLine for word1 it cannot capture it because
		//curser is not in next line but next to num,  use next instead of nextLine so the next
		//captures the word next to num
		//
		//if you want it to work with nextLine use it before next so it captures and moves curser on the
		//next line and curser captures num
		// see brayan java class 5 at 1:04 video
		
			
		
		
		
	}

}
