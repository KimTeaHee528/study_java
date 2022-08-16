package com.bnt.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		int random1 = (int) ( Math.random() * (99) + 1 );
		int random2 = (int) ( Math.random() * (99) + 1 );
		int result=0;
		int maxA;
		int minA;
		// 최대 최소 확인
		if (random1>random2) {
			maxA = random1;
			minA = random2;
		}else {
			maxA = random2;
			minA = random1;
		}
		//최소값부터 최대값까지 더하기
		for(int i = minA ; i<=maxA ;i++) {
			result +=i;
		}
		System.out.println(minA + "부터 " + maxA + "까지의 합은 : " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int resultA = (maxA+minA)*(maxA-minA+1)/2;
		System.out.println("확인 \n" + resultA);
	}
}
