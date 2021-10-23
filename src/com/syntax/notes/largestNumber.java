package com.syntax.notes;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//this way it needs to be all variables must be initialized
		// cannot have an else part
int max=0;
int num1=-20;
int num2=20;
int num3=0;

if(num1>num2) {//Independent if conditions 
	max=num1;//max was 5 and if num1 bigger then num2 after num1 is reassined to max which now holds value of num1
}if(num2>max) {//num2 is> then value of num1 stored in max variable?
	max=num2;//if yes then value num2 is reassinged to max
}if(num3>max) {//the con of using independent if is that if num3 is less then max will go to else if their is an else
	max=num3;
}//else {
	//System.out.println("broke the code");
//}
System.out.println("biggest number is "+max);

System.out.println("------------------Another way--------------------------------------------------------------");
Scanner scan=new Scanner(System.in);
System.out.println("Please enter 3 distinct numbers");
int num4=scan.nextInt();
int num6=scan.nextInt();
int num7=scan.nextInt();

if(num4>num6){
  if(num4>num7){
    System.out.println("The largest number is "+num4);
  }else{
    System.out.println("The largest number is "+num7);
  }
}else{
  if(num6>num7){
	  System.out.println("The largest number is "+num6);
  }else{
      System.out.println("The largest number is "+num7);
    }
  }
System.out.println("============another way Else if NOT GOING TO WORK =====================");
int max1=0;
int one=5;
int two=6;
int three=9;  // wouldn't work because from else if only one condition is excuted 
if(one>two) { // one was not bigger than two 
	max1=one;// this was skipped
}else if(two>max1) {// two is bigger than max (0) so 
	max1=two;// this would print and max is 6 program did not allow to check three since its chooses first correct condition
}else if(three>max1) {
	max1=three;
}
System.out.println("and another way to find max "+max1);

System.out.println("========Another way using nested============================");
int max2=0;
int one1=5;
int two2=2;
int three3=6;
if (one1>two2) {
	max2=one1;
	if(one1>three3) {
		max2=one1;
	}else {
		max2=three3;
	}
}else {
	if(two2>three3) {
		max2=two2;
	}else {
		max2=three3;
	}	
}
System.out.println("max2 largest = "+max2);
System.out.println("======================Using relational operators");
int var1=8;
int var2=8;
int var3=8;
int largest=0;
if(var1>var2&&var1>var3) {
	largest=var1;
}else if(var2>var1&&var2>var3){
	largest=var2;
}else {
	largest=var3;
}
System.out.println("using relational Operators "+largest);
}
	}


