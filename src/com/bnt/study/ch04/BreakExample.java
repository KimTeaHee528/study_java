package com.bnt.study.ch04;

public class BreakExample {

	public static void main(String[] args) {
		System.out.println("====while문====");
		int i=1;
		while(true) {
			
			int random = (int)(Math.random()*9+1);
			System.out.println(i+"번째 랜덤값 : "+random);
			i++;
			if(random == 5) {
				break;
			}
		}
		System.out.println("====for문====");
		for(int j=1; j>0;j++) {
			int random = (int)(Math.random()*9+1);
			System.out.println(j+"번째 랜덤값 : "+random);
			if(random == 5) {
				break;
			}
		}
		System.out.println("====브레이크(5가 아니어도 10번 넘어가면 종료)====");
		aa:
		for(int j = 1; j<=1; j++) {
			for(int k=1; k>0;k++) {
				int random = (int)(Math.random()*9+1);
				System.out.println(k+"번째 랜덤값 : "+random);
				if(k>=10) {
					break;
				}
				if(random == 5) {
					break aa;
				}
			}
		System.out.println("10회 초과");
		}
	}
}
