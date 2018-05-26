package com.abstaraction;

public class Car {
	
	int price;
	String name;
	String color;
	
	Engine engine=new Engine();
	Wheel wheel=new Wheel();
	
	void move() {
		//Move Forward
	}	
}

class Wheel{
	String wheelName;
	int wheelPrice;
	
	void rotate() {
		//Wheels rotate
	}
}

class Engine{
	int enjineCapacity;
	int enjineHorsePower;
	
	void internalCombustion() {
		//Engine Method
	}
}