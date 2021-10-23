package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		/*
		 * I want to multiplication table
		 */
		int num=1;
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
		System.out.println("\nwhat is the output");
int sum=0;
for (int i=1; i<=5;i++) {
	sum=sum+i;//sum(0)+i(1)=1  /sum(1)+i(2)=3 /sum(3)+i(3)=6 (will be stored in sum/
}
System.out.println(sum);
System.out.println("\n ==========================================");
int sum1=0;
for (int i=0;i<=40;i+=10) {
	sum1+=i;
	System.out.println(sum1);// will show all the numbers shored in sum and reassinged in sum
}
System.out.println(sum1);// will only show the total in the sum the last value stored in sum
System.out.println("\n=============================================================");

int total=1;
for(int i=1;i<5;i++) {
	total*=i;
	System.out.print(total+"   ");
}
System.out.println(total);


	}

}
