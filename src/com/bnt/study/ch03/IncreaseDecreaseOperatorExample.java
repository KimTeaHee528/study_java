package com.bnt.study.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		++i;
		j++;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		int a = 1;
		int b = 1;
		--a;
		b--;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
// 대입이 먼저 하고 증가
		int k = i++;
		System.out.println("k = " + k);
		System.out.println("i = " + i);
// 증가먼저 하고 대입
		int m = ++j;
		System.out.println("m = " + m);
		System.out.println("j = " + j);
		
		System.out.println("==========================");
		
		int z = ++i + j++;
		System.out.println("z = " + z);
		System.out.println("i = " + i);
		System.out.println("j = " + j);

		System.out.println("==========================");
		

		
	}

}
