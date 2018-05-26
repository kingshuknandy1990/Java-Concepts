package com.basics;

import java.io.IOException;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws IOException,ClassNotFoundException,SQLException{
		
		
		try {
			int i=1/0	;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("Bye Bye");
		}
		
	}
}
