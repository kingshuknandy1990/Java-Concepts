package com.staticdemo;

public class NoOfObjects {
	static int i=0;
	public NoOfObjects(){
		i++;
	}
	public void counter() {
		System.out.println("No of Objects:"+i);
	}
	public static void main(String[] args) 
	{
		NoOfObjects n1=new NoOfObjects();
		NoOfObjects n2=new NoOfObjects();
		NoOfObjects n3=new NoOfObjects();
		NoOfObjects n4=new NoOfObjects();
		n4.counter();
	}
}

