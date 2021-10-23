package com.syntax.class01;

public class VariableValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int myNumber=100;
char gender='W';
int age=22;
//               WITHIN THE SAME PROGRAM WE CANNOT HAVE THE SAME VARIABLE
//int myNumber=1000;  CE we cannot use the same name for variables every variable must be unic or JAVA gets confuse
//double myNumber=10.66; CE different data type dosn't matter variable must be unic JAVA will complain

//				BUT WE CAN REASSIGN THE DATA IN THE VARIABLE
// TO REASSIGN WE ONLY NEED TO USE THE NAME OF THE VARIABLE AND CHANGE THE DATA
myNumber=60;//reassigning the value from line 7 
System.out.println(myNumber);
gender ='M';//you can reassign any variable 
System.out.println(gender);
	}

}
