package com.bnt.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		CarSecond carSecond = new CarSecond();
		CarSecond carSecond2 = new CarSecond("Blue");
		CarSecond carSecond3 = new CarSecond(3000);
		CarSecond carSecond4 = new CarSecond("white",4000);
		
		System.out.println(carSecond.color);
		System.out.println(carSecond2.color);
		System.out.println(carSecond3.cc);
		System.out.println(carSecond4.color + ", " + carSecond4.cc);
	}

}
