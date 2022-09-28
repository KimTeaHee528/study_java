package com.bnt.study.test1;

public class Example {

	public static void main(String[] args) {
		ClassA A = new ClassA();
		ClassA B = new ClassA();
		
		System.out.println("A.A" + A.A);
		System.out.println("B.A" + B.A);
		A.A = 10;
		
		System.out.println("A.A" + A.A);
		System.out.println("B.A" + B.A);

		ClassA.A = 20;
		
		System.out.println("A.A" + A.A);
		System.out.println("B.A" + B.A);
	}
}
