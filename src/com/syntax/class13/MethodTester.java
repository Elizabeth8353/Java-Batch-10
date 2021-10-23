package com.syntax.class13;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methods method=new Methods();
method.repeatWords(3, "hi");
System.out.println("=================================");
method.repeatWords(6, "Syntax");
method.isRaining(true);
method.isRaining(false);
int sum=method.add(10,10);
System.out.println(sum);
	}

}
