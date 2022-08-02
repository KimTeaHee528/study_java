package com.bnt.study.ch02;

public class CastingExample {

	public static void main(String[] args) {

		double doubleValue = 1234567;
		System.out.println("doubleValue : " + doubleValue);
		
		double doubleValue2 = 1234567891;
		System.out.println("doubleValue2 : " + doubleValue2);

		System.out.println("=========double을 float에 넣을때========");

		float floatValue = (float)doubleValue;
		System.out.println("floatValue : " + floatValue);
		float floatValue2 = (float)doubleValue2;
		System.out.println("floatValue : " + floatValue2 + " 오차생김\n");
		

		System.out.println("=========float을 더 작은데 넣을때========");
		long longValue = (long)floatValue;
		System.out.println("longValue : " + longValue);
		
		int intValue = (int)longValue;
		System.out.println("intValue : " + intValue);
		
		short shortValue = (short)intValue;
		System.out.println("shortValue : " + shortValue);
		
		byte byteValue = (byte)shortValue;
		System.out.println("byteValue : " + byteValue);
		
		
		
		System.out.println("=========int를 string으로 변환========");
		int intValue2 = 100;
		System.out.println("intValue2 : " + intValue2);
		
		String stringValue = String.valueOf(intValue2);
		System.out.println("stringValue : " + stringValue);
		

		System.out.println("=========string을 int로 변환========");
		String stringValue2 = "756148";
		System.out.println("stringValue2 : " + stringValue2);
		int intValue3 = Integer.parseInt(stringValue2);
		System.out.println("intValue3 : " + intValue3);
		
		
		
		
	}

}
