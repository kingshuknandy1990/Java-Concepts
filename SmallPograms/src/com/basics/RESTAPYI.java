package com.basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RESTAPYI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url=new URL("");
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		con.setRequestMethod("");
		con.connect();
	}

}
