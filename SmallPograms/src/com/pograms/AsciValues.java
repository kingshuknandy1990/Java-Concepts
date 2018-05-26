package com.pograms;

public class AsciValues {

	public static void main(String[] args) {
		//Asci is of 7 bits
		//So range 2^7=128
		//Range from 0 to 127
		for (int i = 0; i <= 127; i++) {
			//%d numeric Values
			//%c character Values
			//printf For printing a format
			System.out.printf("%d : %c \n",i,i);
		}

	}

}
