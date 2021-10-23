package com.syntax.review04;

public class PrePostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
System.out.println(++i);//11 because we are incrementing first (pre-increment)
System.out.println(i++);//11 because the value of i=11 then it's incremented (post-increment)
System.out.println(i);//shows value of i in line 9

System.out.println("===============================================================");
int y=10;
System.out.println(y+++(y++));//21
System.out.println(y);//12 the value of (y++) in line 14
//System.out.println(++y+ y++);//++y(11)+ y++(11)=22



	}

}
