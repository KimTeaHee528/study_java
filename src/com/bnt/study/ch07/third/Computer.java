package com.bnt.study.ch07.third;

public class Computer extends Calculator {
	public double areaCircle(double r) {
		System.out.println("Computer(자식) 객채의 areaCircle 실행");
		return Math.PI * r * r;
	}
}