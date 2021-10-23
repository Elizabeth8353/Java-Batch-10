package com.syntax.class09;

public class MoreArray {

	public static void main(String[] args) {
		// FIXED IN SIZE
		//during execution when java runs code --> it cannot increase size
double [] d=new double[4];
//java places default value index[0]=0.0 automatically
d[1]=10.99;
d[2]=7.55;
d[3]=5.52;
//d[4]=5.8;//ArrayIndexOutOfBoundsException

int [] numbers=new int[2];
numbers[0]=100;
numbers[1]=200;
System.out.println(numbers[2]);

System.out.println("=========Another way====================");
int[] num;
num=new int[3];

num[0]=3;

	}

}
