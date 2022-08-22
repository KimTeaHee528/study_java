package com.bnt.study.ch06;

public class CarExample {
	public static void main(String[] args) {
		
		Car car1 = new Car();		
		Car car2 = new Car();
		Iphone iphone = new Iphone();
		
		
		System.out.println(car1.name +"\n" + car1.name2[1]);
		System.out.println(car2.name +"\n" + car2.name2[1]);
		System.out.println("==========================");
		System.out.println(iphone.name);
	}
}