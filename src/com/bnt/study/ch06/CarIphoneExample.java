package com.bnt.study.ch06;

public class CarIphoneExample {
	public static void main(String[] args) {
		
		Car car1 = new Car();		
		Car car2 = new Car();
		
		Iphone iphone = new Iphone();
		Bag bag = new Bag();
		
		car1.name2[1] = "김희선";
//		car2.name = "아방이2";  // 프라이빗은 접근 금지
		
		car1.setname("sadfgvase");
		String name = car1.getname();
		car1.setname2("qqqqq");
		
		System.out.println(name +"\n" + car1.name2[1]);
		System.out.println(name +"\n" + car2.name2[1]);
		car1.pr();
		System.out.println("==========================");
		System.out.println(iphone.name);
		iphone.pr();
		bag.pr_brand();
	}
}