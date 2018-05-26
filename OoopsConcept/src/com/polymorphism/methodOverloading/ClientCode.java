package com.polymorphism.methodOverloading;

public class ClientCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Car car= new Car();
   Car ford=new FordCar();
   Car honda=new HondaCar();
   
   car.move();
   ford.move();
   honda.move();
	}

}
