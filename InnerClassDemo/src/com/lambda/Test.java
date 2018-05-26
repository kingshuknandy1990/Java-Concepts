package com.lambda;

public class Test {

	public static void main(String[] args) {
		Phone phone=new Phone() {
			
			@Override
			public void show(String key, String Value) {
				System.out.println("Key: "+key+" Value: "+Value);
				
			}
		};
		phone.show("abc", "123");
	}
}

interface Phone{
	public void show(String key,String Value);

}