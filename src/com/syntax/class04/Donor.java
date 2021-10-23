package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		/*
		 * Create a Java program and call it a Donor.
    *In order to be eligible to donate your blood you have to be 18 years old. Also once you identify age eligibility
    *then we have to see if person matches weight requirements. If person weight it more than 110 lbs 
    * then he/she is eligible, otherwise we cannot accept such a patient.
		 */
int age=19;
int weight=100;

if(age>=18) {
	
	if(weight>=110) {
		System.out.println("you are eligible age and weight fills the requirements");
	}else {
		System.out.println("sorry weight is not enough to be eligible");
	}
}else {
	System.out.println("Sorry not eliglible, comeback when you are 18");
}

	}

}
