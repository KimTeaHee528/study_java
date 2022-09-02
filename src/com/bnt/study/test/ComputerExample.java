package com.bnt.study.test;

public class ComputerExample {

	public static void main(String[] args) {
		Double R = (double) 7;
		
		Calculator cal = new Calculator();
		System.out.println("원의 반지름: " + R);
		System.out.println("\n Calculator 객채의 원면적 구하는 프로그램 실행\n원면적: " + cal.Cal_area(R));
		
		Computer com = new Computer();
		System.out.println("\n Calculator 객채의 원면적 구하는 프로그램 실행\n원면적: " + com.Cal_area(R));
		
	}

}
