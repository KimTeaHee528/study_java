package com.bnt.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

		int a = 65;

		boolean result1 = (a>=65);
		System.out.println("result1 : " + result1);
		boolean result2 = (a<=90);
		System.out.println("result2 : " + result2);
		
		if(a >= 65 & a <=90) {
			System.out.println("65이상 90이하");
		}
		if(a <= 65 & a <=90) {
			System.out.println("65미만 90이하");
		}
		
		
		System.out.println("=============================");
		
		if(a >=65 | a <=90) {
			System.out.println("둘다 참");
		}
		if(a >=66 | a <=90) {
			System.out.println("하나만 참");
		}
		if(!(a >=66 | a <=50)) {
			System.out.println("둘다 거짓");
		}
		
		if(a >=65 || a <=90) {
			System.out.println("둘다 참");
		}
		if(a >=66 || a <=90) {
			System.out.println("하나만 참");
		}
		if(!(a >=66 || a <=50)) {
			System.out.println("둘다 거짓");
		}


		System.out.println("=============================");
		if(a>=65 ^ a<=50) {
			System.out.println("하나만 참 = 1");
		}
		if(!(a>=65 ^ a<=90)) {
			System.out.println("둘다 참 = 0");
		}
		if(!(a>=66 ^ a<=50)) {
			System.out.println("둘다 거짓 = 0");
		}
		
		
		
	}
}
