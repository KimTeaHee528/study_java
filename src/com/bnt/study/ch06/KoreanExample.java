package com.bnt.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {
//		Korean k1 = new Korean("김태희", "011225-1234567");
//		System.out.println("k1.name : " + k1.name);
//		System.out.println("k1.ssn : " + k1.ssn);
//		Korean k2 = new Korean("김태희", "대한민국");
//		System.out.println("k2.name : " + k2.name);
//		System.out.println("k2.na : " + k2.na);
//		Korean k3 = new Korean("김태희", 45);
//		System.out.println("k3.name : " + k3.name);
//		System.out.println("k3.age : " + k3.age);
		

		Korean k1 = new Korean("김태희", "011225-1234567");
		System.out.println(Korean.nationality);
		System.out.println(k1.nationality);
		k1.nationality = "aaaaaaaaaa";
		Korean k2 = new Korean("김태희", "011225-1234567");
		System.out.println(Korean.nationality);
		System.out.println(k1.nationality);
		System.out.println(k2.nationality);

		System.out.println(Korean.staticTest(0));
		System.out.println(Korean.aa);
		System.out.println(k1.staticTest(0));
		System.out.println(k1.aa);
		Korean.staticTest(5);
		System.out.println(Korean.staticTest(0));
		System.out.println(k1.staticTest(0));
		
		k1.tttt();
		
	}
}
