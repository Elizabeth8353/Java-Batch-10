package com.syntax.class13;

public class PhoneTester {

	public static void main(String[] args) {
		Phone2 iphone=new Phone2();
		iphone.camera=12;
		iphone.make="Apple";
		iphone.model="Iphone12";
		iphone.is5G=true;
		iphone.screenSize=6.7;
		iphone.makeCall();
		iphone.takePictures();

	}

}
