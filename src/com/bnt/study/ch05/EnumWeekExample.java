package com.bnt.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		//	Week.java 확인
		Week abc;
		Week xyz;
//		wook xyz;
//		
//		abc = 1;
//		abc = "gsdln";
//		abc = MONDAY;
		abc = Week.MONDAY;
		

		System.out.println(Week.FRIYDAY);
		System.out.println(abc);
		
		String name = abc.name();
		System.out.println(name);
		
		int ord = abc.ordinal(); // 숫자로 출력해줌
		System.out.println(ord);
		
		xyz = Week.THURSDAY;
		int result1 = abc.compareTo(xyz); //abc가 xyz보다 3작다
		int result2 = xyz.compareTo(abc); //xyz가 abc보다 3크다

		System.out.println(result1);
		System.out.println(result2);
		
		int index = 0;
		Week[] days = Week.values();
		for(Week day: days) {
			System.out.println(index + ": day: "+ day);
			index ++;
		}
	}
}
