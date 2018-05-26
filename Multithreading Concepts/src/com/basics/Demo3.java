package com.basics;

public class Demo3 {
	public static void main(String[] args) {
		Runnable obj1=new ThreadDemo1() {
			public void run() {
				
				for (int i = 1; i < 10000; i++) {
					System.out.println("Hello"+i);
				}			
		}	
		};
		Runnable obj2=new ThreadDemo2() {
			public void run() {
				for (int i = 1; i < 10000; i++) {
					System.out.println("Hi"+i);
				}	
			}
		};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
