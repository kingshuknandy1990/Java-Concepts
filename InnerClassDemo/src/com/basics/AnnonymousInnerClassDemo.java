package com.basics;

public class AnnonymousInnerClassDemo {
	public static void main(String[] args) {
		Phone obj=new Phone() {//Anno
			public void show() {
				System.out.println("Call,sms,camera");
			}	
		};
		obj.show();

	}
}

class Phone{
	public void show() {
		System.out.println("Call");
	}
}
