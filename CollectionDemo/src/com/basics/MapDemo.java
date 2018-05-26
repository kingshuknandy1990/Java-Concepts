package com.basics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("myName", "King");  //Each one is an Entry
		map.put("actor", "John");
		map.put("ceo", "Rama");
		
		System.out.println(map);
	
		// We can get all the keys and store it in a set by the keySet function of Map
		Set<String> keys=map.keySet();
		// Enhanced For Loop to iterate over the each key
		for (String key:keys) {
		System.out.println(key+" : "+map.get(key));	
		}
		
		//By HashTable[Hash Table is ThreadSafe(Synchronized)
		Map phonebook=new Hashtable<>();
		phonebook.put("King", "9002341234");// Each one is an entry
		phonebook.put("Ram", "8017234567");
		phonebook.put("Shyam", "9000135678");
		phonebook.put("Rohit", "8888222209");
		
		Set<Map.Entry<String, String>> values=phonebook.entrySet();
		for (Map.Entry<String, String> entry:values) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
