package com.bnt.study.ch04;

public class ForPrintFromMinToMaxExample {

	public static void main(String[] args) {
		// Min부터 Max까지 더하는 프로그램 작성		
		System.out.println("=================================");
		int resultSum = 0;
		int min = 1;
		int max = 1;
		int sum = max+min;
		int num = max-min+1;
		for(int i=0;i<num/2;i++) {
			resultSum += sum;
		}
		if (num%2 == 1) {
			resultSum += sum/2;
		}else {
		}
		System.out.println("검산 : "+resultSum);
	}
}