package org.dhananjay.programming;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	private String name;
	private int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return name + " " + age;
	}
}

class SortByAge implements Comparator<Student> {
	@Override
	public int compare(Student ob1, Student ob2) {
		return ob1.getAge() - ob2.getAge();
	}
}

public class CustomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student[3];
		arr[0]= new Student("Dhananjay", 23);
		arr[1]=new Student("aKASH", 34);
		arr[2]=new Student("Tanmay", 25);
		Arrays.parallelSort(arr, new SortByAge());
		System.out.print(Arrays.toString(arr));

	}

}
