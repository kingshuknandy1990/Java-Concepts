package com.basics;

public class WithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fibonaciSeries(20);
	}
	
	public static void fibonaciSeries(int numbers) {
		int arr[] = new int[numbers];
		arr[0]=0;
		arr[1]=1;
		for (int i = 2; i <numbers; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
