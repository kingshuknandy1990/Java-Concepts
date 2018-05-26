package com.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(1, 55));
		students.add(new Student(2, 35));
		students.add(new Student(3, 25));
		students.add(new Student(4,95));		
		for (Student ss:students) {
			System.out.println(ss);
		}
		System.out.println("---------------");
/*		Comparator<Student> comparator=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.marks>o2.marks?1:-1;
			}
		};
		Collections.sort(students, comparator);
		for (Student ss:students) {
			System.out.println(ss);
		}*/
		Collections.sort(students);
		for (Student ss:students) {
			System.out.println(ss);
		}
	}
	
	
}

class Student implements Comparable<Student>{
	int rollnum;
	int marks;
	public Student(int rollnum, int marks) {
		super();
		this.rollnum = rollnum;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student st) {
		return this.marks>st.marks?1:-1;
	}
}
