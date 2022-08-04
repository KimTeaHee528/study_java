package com.bnt.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "김태희";
		String str2 = "김태희";
		String str3 = new String("김태희");

		boolean result1 = (str1 == str2);
		System.out.println("str1 == str2 >>> " + result1);
		boolean result2 = (str1 == str3);
		System.out.println("str1 == str3 >>> " + result2);

		System.out.println("str1.equals(str2) = " + str1.equals(str2));
		System.out.println("str1.equals(str3) = " + str1.equals(str3));
	}

}
