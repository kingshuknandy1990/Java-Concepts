package com.basics;

public class Demo1 {

public static void main(String[] args) {
	A a=new A();
	a.start();
	
	B b=new B();
	b.start();
}

}

class A extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		show();
	}
	
	public void show() {
		for (int i = 1; i < 10000; i++) {
			System.out.println("Hello"+i);
		}
	}
}

class B extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		show();
	}
	
	public void show() {
		for (int i = 1; i < 10000; i++) {
			System.out.println("Hi"+i);
		}
	}
}