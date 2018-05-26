package com.basics;

public class ReThrowExceptionDemo {

	public static void main(String[] args) {
		B b=new B();
		try {
			b.method1();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception Re-Occured :I caught the Re-thrown Exception");
		}
	}
}

class B{	
	public void method1() {
		try {
			String str="Hello";
			char ch=str.charAt(5);		
		} catch (StringIndexOutOfBoundsException e1) {
			System.out.println("Exception Occured : Please check the index, it should be within range");
			throw e1;  //Re-thrown the exception
		}
	}
}