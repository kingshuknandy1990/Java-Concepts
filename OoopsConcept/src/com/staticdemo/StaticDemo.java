package com.staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
	A.num2=5;
	A obj1=new A();
	A obj2=new A();   
	A obj3=new A();
	
	A.increment();
	obj1.num1=2;
	obj2.num1=3;
	obj3.num1=4;
	}

}

class A{
	int num1;
	static int num2;
	public static void increment() {
		num1++; //Error
	}
}