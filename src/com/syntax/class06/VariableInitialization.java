package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ask user to enter name and age
 * based on age define who is a user
 * if age is from 0-3->baby
 * if age is from 3-5->toddler 
 * if age is from 5-15->kid
 * if age is from 12-19 ->teenager
 * if age is from 19-65 ->adult
 * if 65+->senior
 */
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println("Please enter your age ");
		int age=in.nextInt();
		
		String whoAreYou;
		if(age>=0 && age<3) {
			whoAreYou="baby";
		}else if(age>=3 && age<6) {
			whoAreYou="kid";
		}else if(age>=6&&age<20) {
			whoAreYou="teenager";
		}else if(age>=20&&age<65) {
			whoAreYou="adult";
		}else if(age>=65){
			whoAreYou="Senior";
		}else {
			whoAreYou="Allien";
		}
		
		System.out.println(name+" you are "+whoAreYou);//if no else block u need to initialize your variable
	}

}
