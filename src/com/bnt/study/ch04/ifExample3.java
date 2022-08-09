package com.bnt.study.ch04;

public class ifExample3 {
	
	public static void main(String[] args) {
		int intA = 11;
		int intB = 10;
		if(intA>intB) {
			System.out.println("intA가 intB보다 크다.");
		}else if(intA<intB) {
			System.out.println("intA가 intB보다 작다.");
		}else {
			System.out.println("intA와 intB은 크기가 같다.");
		}
	}
}