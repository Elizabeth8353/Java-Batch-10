package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
str="Some value";

Scanner input;
input=new Scanner(System.in);

int num=input.nextInt();
System.out.println(num);

char singleChar=input.next().charAt(0);
System.out.println(singleChar);

str=input.next();
System.out.println(str);

input.nextLine();
str=input.nextLine();
System.out.println(str);
String var=input.nextLine();
System.out.println(var);
	}

}
