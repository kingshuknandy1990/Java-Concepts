package com.basics;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Other {
	
	static {
		System.out.println("Static Block");
	}

	{
	System.out.println("Instance Block");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Other ot=new Other();
		System.out.println("main");
		Other ot=new Other();
		//System.out.println(ot.sum(5000L));
		
		

		
		
	}

	/*static int i=0;
	public Long sum(Long n) {
		System.out.println(++i);
			return sum(n);		
	}*/
}
