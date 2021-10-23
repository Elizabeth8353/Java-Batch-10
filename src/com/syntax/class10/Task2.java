package com.syntax.class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries.While retreving all values from array 
		 * print capital for each country use 2 loops
		 */
		
		String[] Country= {"USA","Paris","Bolivia","Australia"};
		String[] capitals= {"Dc","France","LaPaz","Canberra"};
		
		for(int i=0;i<Country.length;i++) {
			for(int j=0;j<Country.length;j++) {
			}
			System.out.println(Country[i]+"     "+capitals[i]);
		}
		

	}

}
