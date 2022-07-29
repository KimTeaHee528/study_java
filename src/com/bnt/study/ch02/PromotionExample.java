package com.bnt.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {

//		형변환	
		
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue : " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		int intValue2 = 2134567890;
		System.out.println("intValue2 : " + intValue2);

		byte byteValue2 = (byte) intValue;
		System.out.println("bytetValue2 : " + byteValue2);
		
		double doubleValue = 21345.67890;
		System.out.println("intValue2 : " + intValue2);

		int intValue3 = (int) doubleValue;
		System.out.println("intValue3 : " + intValue3);
		
		
		int intValue4 = 200;
		System.out.println("intValue4 : " + intValue4);
		
		double doubleValue2 = intValue4;
		System.out.println("doubleValue2 : " + doubleValue2);
		
		
	}

}
