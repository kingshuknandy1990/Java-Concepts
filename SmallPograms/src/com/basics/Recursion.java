package com.basics;

public class Recursion {

	
	public static void main(String[] args) {
		System.out.println(recusionFactorial(4));
	}
	
	public static int recusionFactorial(int p) {
		if(p==1) {
			return p;
		}else {		
			return p*recusionFactorial(p-1);
		}
	}
	
	public static void fibonaciSeries(int numbers) {
		int arr[] = new int[numbers];
		arr[0]=0;
		arr[1]=1;
		/*for (int i = 2; i <numbers; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		if(numbers==1) {
		System.out.println(0);	
		}else if(numbers==2) {
		System.out.println(1);
		}else {
			
		}
	}
}
