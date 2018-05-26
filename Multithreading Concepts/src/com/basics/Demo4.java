package com.basics;

public class Demo4 {
	public static void main(String[] args) {
		
		Thread t1=new Thread(() -> 
		{
			for (int i = 1; i < 10000; i++) {
				System.out.println("Hello"+i);
			}					
	    });
		Thread t2=new Thread(()->
		{
			for (int i = 1; i < 10000; i++) {
				System.out.println("Hi"+i);
			}		
		});
		
		t1.start();
		t2.start();
	}
}
