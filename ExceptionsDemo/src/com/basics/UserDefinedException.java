package com.basics;

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			int a=3;
			if(a<5)
				throw new MyException("Error Occured");
		}
		catch (Exception e) {
			System.out.println("Exception::"+e);
		}

	}

}

class MyException extends Exception{

	public MyException(String message) {
		super(message);// Call the Constructor of Exception Class
		// TODO Auto-generated constructor stub
	}
	
}