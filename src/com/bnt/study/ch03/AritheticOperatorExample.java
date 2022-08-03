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
		
//===========================================

		System.out.println("===========================================");
		double resultA1 = (1+((double)2/3)-((double)5/8))*(9+((double)4/5));
		System.out.println(resultA1);
		
		double resultA2 = 5-(3.25-(1+(double)5/6))*(double)12/17;
		System.out.println(resultA2);
		
		System.out.println("===========================================");
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);

		System.out.println("===========================================");
		average("홍길동",60,70,85,90,45);
		average("박말순",50,75,70,60,70);
		average("고장난",55,60,64,58,90);
		average("도롱뇽",80,70,63,88,78);
		
		
		
		

	}
	public static void sum(int a,int b,int c) {
		System.out.println(a + "+" +b + "+" + c + " = " + (a+b+c));
	}

	public static void average(String name, int engleish, int math, int physics, int music, int athletic){
		System.out.println(name+ "의 평균점수는 " + (double) (engleish + math + physics + music + athletic)/5);
	}
	
	
	
}
