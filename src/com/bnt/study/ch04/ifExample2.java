package com.bnt.study.ch04;

public class ifExample2 {
	
	public static void main(String[] args) {

		total_price(grade_string(5), 10);

	}
	public static String grade_string(int grade_int) {
		String grade_string = null;
		if(grade_int == 1) {
			grade_string = "일반";
		}else if(grade_int == 2) {
			grade_string = "브론즈";
		}else if(grade_int == 3) {
			grade_string = "실버";
		}else if(grade_int == 4) {
			grade_string = "골드";
		}else if(grade_int == 5) {
			grade_string = "플래티넘";
		}else {}
		return grade_string;
	}
	public static double total_price(String grade, int price) {
		double totale_price;
		if(grade == "일반") {
			totale_price = price*1.05;
			System.out.println(grade+", "+totale_price);
		}else if(grade == "브론즈") {
			totale_price = price*1.1;
			System.out.println(grade+", "+totale_price);
		}else if(grade == "실버") {
			totale_price = price*1.15;
			System.out.println(grade+", "+totale_price);
		}else if(grade == "골드") {
			totale_price = price*1.2;
			System.out.println(grade+", "+totale_price);
		}else {
			totale_price = price*1.27;
			System.out.println(grade+", "+totale_price);
		}
		return totale_price;
	}
}