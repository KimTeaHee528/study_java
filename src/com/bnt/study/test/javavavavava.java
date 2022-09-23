package com.bnt.study.test;

import java.util.Scanner;

public class javavavavava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A;
		System.out.println("문자열?");
		A = sc.next();
		System.out.println("문자열! : "+ A);
		sc.close();
		int r=1;
		for(int i=0 ; i<A.length()-i ; i++) {
			if(A.charAt(i)==A.charAt(A.length()-i-1)) {
			}else {
				r=0;
				break;
			}
		}
		if(r==1) {
			System.out.println("맞음");
		}else {
			System.out.println("틀림");
		}
}}
