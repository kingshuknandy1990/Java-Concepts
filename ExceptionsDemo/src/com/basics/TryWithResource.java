package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	/**
	 * Try with Resource Java 1.7 onwards
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
			String str="";
			str=br.readLine();
		}
	}

}
