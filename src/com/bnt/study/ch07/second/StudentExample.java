package com.bnt.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		Student student1 = new Student("김태희1","ssn1");
		Student student2 = new Student("김태희2","ssn2",5);
		
		System.out.println("=======student1-부모=======");
		System.out.println(student1.name);
		System.out.println(student1.ssn);
		System.out.println("=======student1-자식=======");
		System.out.println(student1.studentNo);
		
		System.out.println("=======student2-부모=======");
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println("=======student2-자식=======");
		System.out.println(student2.studentNo);
	}
}
