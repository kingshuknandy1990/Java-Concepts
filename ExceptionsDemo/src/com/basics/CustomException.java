package com.basics;

public class CustomException {

	public static void main(String[] args) {
	try {
		int a=3;
		if(a<5)
			throw new ArithmeticException();
	}catch (ArithmeticException e) {
		System.out.println("Exception Occured "+"Minimum Value Of output is 5");
	}
	catch (Exception e) {
		// TODO: handle exception
	}

	}

}
