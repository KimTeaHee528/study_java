package com.bnt.study.ch03;

public class AritheticOperatorExample {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;

		int result1 = v1+v2;
		int result2 = v1-v2;
		int result3 = v1*v2;
		int result4 = v1/v2;
		int result5 = v1%v2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

		double result6 = v1 / v2;
		System.out.println(result6);
		double result7 = (double) v1 / v2;
		System.out.println(result7);
		
		double d = 3.14;
		double i = 1;
		double d2 = d%i;
		System.out.println(d2);
	}
}
