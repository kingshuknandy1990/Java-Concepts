package com.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(305);
	list.add(998);
	list.add(774);
	list.add(236);
	list.add(881);
	Comparator comparator=new Comparator<Integer>() {
		@Override
		public int compare(Integer numFirst, Integer numSecond) {
			/*if(numFirst%10>numSecond%10) 
				return 1;	
			return -1;*/
			return numFirst%10>numSecond%10?1:-1;
		}
	};
	Collections.sort(list,comparator);
	list.forEach(System.out::println);
}
}
