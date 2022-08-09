package com.bnt.study.ch04;

public class ifExample2 {
	
	public static void main(String[] args) {
		int grade1 = 1;
		int price1 = 10000;
		totalPrice(grade1, price1);		
		int grade2 = 2;
		int price2 = 10000;
		totalPrice(grade2, price2);		
		int grade3 = 3;
		int price3 = 10000;
		totalPrice(grade3, price3);		
		int grade4 = 4;
		int price4 = 10000;
		totalPrice(grade4, price4);		
		int grade5 = 5;
		int price5 = 10000;
		totalPrice(grade5, price5);
	}
	public static void totalPrice(int grade, int price) {
		double totalePrice;
		if(grade == 1) {
			totalePrice = price*dicount_rate(grade);
		}else if(grade == 2) {
			totalePrice = price*dicount_rate(grade);
		}else if(grade == 3) {
			totalePrice = price*dicount_rate(grade);
		}else if(grade == 4) {
			totalePrice = price*dicount_rate(grade);
		}else {
			totalePrice = price*dicount_rate(grade);
		}
		System.out.println(gradeString(grade)+", "+(int)totalePrice);
	}
	public static String gradeString(int grade_int) {
		String gradeString = null;
		if(grade_int == 1) {
			gradeString = "일반";
		}else if(grade_int == 2) {
			gradeString = "브론즈";
		}else if(grade_int == 3) {
			gradeString = "실버";
		}else if(grade_int == 4) {
			gradeString = "골드";
		}else if(grade_int == 5) {
			gradeString = "플래티넘";
		}else {}
		return gradeString;
	}
	public static double dicount_rate(int grade_int) {
		double rate = 1;
		if(grade_int == 1) {
			rate = 0.95;
		}else if(grade_int == 2) {
			rate = 0.90;;
		}else if(grade_int == 3) {
			rate = 0.85;;
		}else if(grade_int == 4) {
			rate = 0.8;;
		}else if(grade_int == 5) {
			rate = 0.973;;
		}else {}
		return rate;
	}
}

/*
 * 
 * int grade = 1; int cost = 10000;
 * 
 * if(grade == 1) { System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " +
 * (int) cost*(1-0.05) + "원입니다."); }
 * 
 */

