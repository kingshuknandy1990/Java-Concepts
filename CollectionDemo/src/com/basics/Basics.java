package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Basics {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		Object valuesOther[]=new Object[4];
		valuesOther[0]="Kingshuk";
		valuesOther[1]=2;
		valuesOther[2]=4.77;
		
		
		Collection values=new ArrayList<>();
		
		
		//Traversing of Arraylist
		List list=new ArrayList<>();
		//Conventional For Loop
		for (int i=0;i<list.size();i++) {
			Object object = list.get(i);		
		}	
		//By while loop-- Iterator is a very old Technique
		Iterator iterator=list.iterator();		
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();			
		}		
		//Enhanced For Loop
		for(Object i:list) {
			System.out.println(i);
		}	
		//Stream API using Lambda Expression-- Java 8 onwards
		list.forEach(System.out::println);
	
		
		//Working with Vector
		Vector v=new Vector<>();
	
		v.size();
		System.out.println("Size:"+v.capacity());
		
		List<Integer> listOther=Arrays.asList(56,24,33,25);
		
		List<Integer> listOtherNew=new ArrayList<Integer>() {
			{
				add(23);
				add(45);
				add(76);
			}
		};
		
		Collections.synchronizedList(new ArrayList<>());
		Stack<Integer> stack=new Stack<Integer>();
		stack.isEmpty();//Out=boolean/If Stack empty then True else False
		stack.peek();//Out=Element/Returns Top Most Object without removing it
		stack.pop();//Out=Element/pops the top most element and returns it
		stack.push(23);//Out=Element/pushes an element on the top of the stack and returns that element
		stack.search(45);//Out=int/Returns the position of the element from the top of the stack
							//If object is not found then returns -1.
	}

}


