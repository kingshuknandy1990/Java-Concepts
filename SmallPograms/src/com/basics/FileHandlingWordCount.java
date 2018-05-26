package com.basics;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHandlingWordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*DataInputStream dataInputStream=new DataInputStream(System.in);
	
		FileOutputStream fos=new FileOutputStream("C:\\Users\\kingshuk.nandy\\gitLocalRepo\\SmallPograms\\resources\\test.txt");
		
		System.out.println("===Enter The Text: enter @ at the end=====");
		char ch;
		while ((ch=(char) dataInputStream.read())!='@') {
			fos.write(ch);
		}
		fos.close();*/
		
		FileInputStream fis=new FileInputStream("C:\\Users\\kingshuk.nandy\\gitLocalRepo\\SmallPograms\\resources\\test.txt");
		char ch;
		StringBuffer str=new StringBuffer();
		while ((ch=(char) fis.read())!='@') {
			str.append(ch);
			//System.out.print(ch);
		}
		fis.close();
		System.out.println("Check:"+str);
		Pattern p = Pattern.compile("[\\w']+");
		Matcher m = p.matcher(str);
		
		HashMap<String, Integer> hmap=new HashMap<>();
		while ( m.find() ) {
			String word=str.substring(m.start(), m.end());
		    System.out.println(word);
		    if(hmap.containsKey(word)) {
		    	hmap.put(word, hmap.get(word).intValue()+1);
		    	//hmap.get(word).intValue();
		    }else {
		    	hmap.put(word, 1);
		    }
		}
		
		for (Map.Entry<String, Integer> entry:hmap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
	}

}
