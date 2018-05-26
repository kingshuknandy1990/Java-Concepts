package com.basics;

public class B extends A {

	public static String color="White";
	public void testA() {
		System.out.println("Inside BA");
	}

	public void testB() {
	System.out.println("Inside B");	
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.checker();
	}
	
	public void checker() {
		System.out.println(color);
		System.out.println(super.color);
	}
}


class C extends A{
	
public void testC() {
	
	System.out.println("Inside C");
	}

public void testA() {
	System.out.println("Inside CA");
}
}