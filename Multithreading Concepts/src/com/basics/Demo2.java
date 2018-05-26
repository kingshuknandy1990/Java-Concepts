package com.basics;

public class Demo2 {

public static void main(String[] args) throws InterruptedException {
		Runnable obj1=new ThreadDemo1();
		Runnable obj2=new ThreadDemo2();
		
		Thread t1=new Thread(obj1,"First Other");
		Thread t2=new Thread(obj2, "Second Other");
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		//t1.setName("First Thread");
		//t2.setName("Second Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	/*	t1.join();		
		t2.join();

		System.out.println(t1.isAlive());
		System.out.println("Bye Bye");*/
		System.err.println(t1.getName()+"==="+t1.getPriority());
		System.err.println(t2.getName()+"==="+t2.getPriority());;
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.err.println(t1.getName()+"==="+t1.getPriority());
		System.err.println(t2.getName()+"==="+t2.getPriority());;
<<<<<<< HEAD
		
=======
>>>>>>> 955242389a509726b7aac47cc2789e9c908b605d
}
}
class ThreadDemo1 implements Runnable{
	@Override
	public void run() {
		Thread.currentThread().getPriority();
			for (int i = 1; i < 20; i++) {
				System.out.println("Hello"+i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}			
	}
}

class ThreadDemo2 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i < 20; i++) {
			System.out.println("Hi"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
}
