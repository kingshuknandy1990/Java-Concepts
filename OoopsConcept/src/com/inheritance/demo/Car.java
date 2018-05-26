package com.inheritance.demo;

public class Car {

	public static void main(String[] args) {
		Car c=new Suzuki();
	}
}
class Suzuki extends Car{	
	public Suzuki() {
		super();
		System.out.println();
	}
}
