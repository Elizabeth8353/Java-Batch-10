package com.syntax.class13;

public class Phone {
	//Attributes
	String model;
	String color;
	String carrier;
	
	//behaviors
	void Phone() {
		System.out.println("The model of your phone is "+model+" the color is "+color+" and carrier is "+carrier);
	}
	void charging() {
		System.out.println(model+" Phone is charging");
	}
	static void silentMode(boolean b) {
		System.out.println("Your phone is silent "+b );
	}
	

	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		iPhone.model="Iphone";
		iPhone.color="Pink";
		iPhone.carrier="At&T";
		iPhone.Phone();
		iPhone.charging();
	    silentMode(true);
	    System.out.println("======================================================");
	    Phone android=new Phone();
	    android.model="Samsung";
		android.color="silver";
		android.carrier="T-Mobil";
		android.Phone();
		android.charging();
		silentMode(false);
		System.out.println("==============================================");
		Phone nokia=new Phone();
		nokia.model="Nokia 8";
		nokia.color="Gray";
		nokia.carrier="Verizon";
		nokia.Phone();
		nokia.charging();
		silentMode(true);
	    
	    
	}

}
