package com.constructor;

public class Parameterized_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(5);
	}
}

class A {
	
	public A() {
	System.out.println(" In A Constructor");
	}
/*	public A(int i) {
		System.out.println(" In A Constructor para");
	}*/

	public A(double d) {
		System.out.println(" In A Constructor intDouble");
	}
}
