package com.staticdemo;
import static java.lang.System.out; //We have import static method out
import static com.staticdemo.Sample.show; //We have import static method show

public class StaticImportDemo {
	public static void main(String[] args) {
		out.println("Hello how are you");
		show();
	}
}
class Sample{
	public static void show() {
		
	}
}
