package com.syntax.class08;

public class OddEvenLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sOdd = new StringBuilder("");
		StringBuilder sEven = new StringBuilder("");
int numb=10;
		while (numb <= 100) {
		    if (numb % 2 == 0) {
		        sEven.append(numb).append(",");
		    }
		    if (numb % 2 != 0) {
		        sOdd.append(numb).append(",");
		    }
		   numb++;
		}

		System.out.println(sEven.toString()+"\n"+sOdd.toString());
	


	
	}

}
