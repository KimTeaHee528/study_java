package com.bnt.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("김태희", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		Korean k2 = new Korean("김태희", "대한민국");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.na : " + k2.na);
		Korean k3 = new Korean("김태희", 45);
		System.out.println("k3.name : " + k3.name);
		System.out.println("k3.age : " + k3.age);
	}
}
