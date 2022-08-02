package com.bnt.study.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		
		  byte byteValue = 12;
		  byte byteValue2 = 12;
		  int intValue = byteValue + byteValue2;
		  System.out.println("바이트 합 : " + intValue);
		  
		  short shortValue1 = 12;
		  short shortValue2 = 12;
		  int intValue2 = shortValue1 + shortValue2;
		  System.out.println("쇼트 합  : " + intValue2);
		  
		  int intValue1 = 12;
		  int intValue22 = 12;
		  int intValue3 = intValue1 + intValue22;
		  System.out.println("인트 합  : " + intValue3);
		  
		  long longValue1 = 12;
		  long longValue2 = 12;
		  long longValue3 = longValue1 + longValue2;
		  System.out.println("롱 합   : " + longValue3);
		  
		  float floatValue1 = 12f;
		  float floatValue2 = 12f;
		  float floatValue3 = floatValue1 + floatValue2;
		  System.out.println("플롯 합  : " + floatValue3);
		  
		  double doubleValue1 = 12;
		  double doubleValue2 = 12;
		  double doubleValue3 = doubleValue1 + doubleValue2;
		  System.out.println("더블 합  : " + doubleValue3);
		 
		
		byte byteValue4 = (byte) (byteValue + intValue);
		int intValue4 = byteValue + intValue;
		System.out.println("인트 + 바이트 = " + byteValue4);
		System.out.println("인트 + 바이트 = " + intValue4);

//		int intValue5 = intValue + doubleValue1;
		double doubleValue5 = intValue + doubleValue1;
		System.out.println("인트 + 더블 = " + doubleValue5);
		
		
		
		
	}

}
