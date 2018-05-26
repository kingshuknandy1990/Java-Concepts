package com.basics;

public class FirstThread extends Thread {

	
	
	@Override
	public void run() {
		super.run();
		for (int i =1; i < 80; i++) {
			System.out.println("2*"+i+"="+(2*i));
		}
	}
	
	public static void main(String[] args) {
		Thread t1=new FirstThread();
		t1.start();
		
	}
}
