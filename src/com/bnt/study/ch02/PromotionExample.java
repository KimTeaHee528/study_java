package com.bnt.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {

//		형변환	
		
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue : " + byteValue);
		
		int intValue = byteValue;
		System.out.println("바이트를 인트로 : " + intValue);

		int intValue2 = 2134567890;
		System.out.println("intValue2 : " + intValue2);

		byte byteValue2 = (byte) intValue;
		System.out.println("인트를 바이트로 : " + byteValue2);
		
		double doubleValue = 21345.67890;
		System.out.println("intValue2 : " + intValue2);

		int intValue3 = (int) doubleValue;
		System.out.println("더블을 인트로 : " + intValue3);
		
		int intValue4 = 200;
		System.out.println("intValue4 : " + intValue4);
		
		double doubleValue2 = intValue4;
		System.out.println("인트를 더블로 : " + doubleValue2);
		
		System.out.println("==========형변환==========");
		
		byte byteValue3 = 10;
		System.out.println("바이트 : " + byteValue3);
		short shortvalue = byteValue3;
		System.out.println("byte를 short에 넣으면 : " + shortvalue);

		int intValue10 = shortvalue;
		System.out.println("short을 int에 넣으면 : " + intValue10);
		long longValue10 = intValue10;
		System.out.println("그 int를 long에 넣으면 : " + longValue10);
		float floatValue = longValue10;
		System.out.println("그 long을 float에 넣으면 : " + floatValue);
		double doubleValue10 = floatValue;
		System.out.println("그 float을 double에 넣으면 : " + doubleValue10);

		
		
	}

}
