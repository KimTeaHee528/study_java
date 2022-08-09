package com.bnt.study.ch04;

public class ifExample4 {
	
	public static void main(String[] args) {

		int aa = 1;
		if(aa%2 > 0) {
			System.out.println("홀수");
		}else{
			if(aa !=0) {
				System.out.println("짝수");
			}else {
				System.out.println("aa는 0");
			}

		}
	}
}