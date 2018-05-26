package com.demo;

public interface Interface1 {

	int t=5;
	public default void demo() {
		System.out.println("I am from Interface1");
	}
	
	public default void view() {
		System.out.println("I am from Interface1");
	}
}
