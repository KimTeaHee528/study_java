package com.bnt.study.ch04;

public class ifExample2 {
	
	public static void main(String[] args) {

		total_price(1, 10);
		
	}
	public static double total_price(int grade, int price) {
		double totale_price;
		if(grade == 1) {
			totale_price = price*1.05;
			System.out.println("일반"+totale_price);
		}else if(grade == 2) {
			totale_price = price*1.1;
			System.out.println("브론즈"+totale_price);
		}else if(grade == 3) {
			totale_price = price*1.15;
			System.out.println("실버"+totale_price);
		}else if(grade == 4) {
			totale_price = price*1.2;
			System.out.println("골드"+totale_price);
		}else {
			totale_price = price*1.27;
			System.out.println("플래티넘"+totale_price);
		}
		return totale_price;
	}
	
}


/*
 * 
 * package com.bnt.study.ch04;
 * 
 * public class ifExample2 {
 * 
 * public static void main(String[] args) {
 * 
 * total_price(1, 10000);
 * 
 * } public static double total_price(int grade, double price) { double
 * totale_price; if(grade == 1) { totale_price = price*1.05;
 * System.out.println("일반"+totale_price); }else if(grade == 2) { totale_price =
 * price*1.1; System.out.println("브론즈"+totale_price); }else if(grade == 3) {
 * totale_price = price*1.15; System.out.println("실버"+totale_price); }else
 * if(grade == 4) { totale_price = price*1.2;
 * System.out.println("골드"+totale_price); }else { totale_price = price*1.27;
 * System.out.println("플래티넘"+totale_price); } return totale_price; }
 * 
 * }
 */