package com.bnt.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		Arithmetic arithmetic = new Arithmetic();
		Arithmetic arithmetic2 = new Arithmetic();
		arithmetic.sum(8, 2);
		arithmetic.sub(7, 2);
		arithmetic.mul(100, 2);
		arithmetic.div(8, 1);
		arithmetic.say();
		System.out.println("===============");
		arithmetic2.insert(8, 2);
		arithmetic2.calculate();
	}
}
