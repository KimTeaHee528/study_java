package com.bnt.study.ch05;

import java.util.Arrays;

public class LottoPlease {

	public static void main(String[] args) {
		double min = 1.0;
		double max = 45.0;
		int random = 0;
		
		String randomString = "";
		int[] randomArray = new int[6];
		
		Boolean isSameNumber = true;
		Boolean isLinearNumber = true;
		Boolean isSameOldNumber = true;
		
		while(isSameNumber || isLinearNumber || isSameOldNumber) {
			
			for (int i=0; i<6; i++) {
				random = (int) ((Math.random() * (max - min)) + min);
				randomArray[i] = random;
			}
			
	//		System.out.println(randomString);
	//		System.out.println("---------");
			
	//		test data
//			randomArray[0] = 1;
//			randomArray[1] = 2;
//			randomArray[2] = 2;
//			randomArray[3] = 6;
//			randomArray[4] = 8;
//			randomArray[5] = 11;
			
			
			// 오름차순 정렬
			 Arrays.sort(randomArray); 
			
//			for(int i=0; i<6; i++) {
//				System.out.println(randomArray[i]);
//			}
			 
			 
//			 중복값 확인
			 aa:
			 for(int i=0; i<6; i++) {
				 for(int j=0; j<6; j++) {
					 if(i != j) {
						 if(randomArray[i] == randomArray[j]) {
							 isSameNumber = true;
							 break aa;
						 } else {
							 isSameNumber = false;
						 }
					 } else {
						 // by pass
					 }
				 }
			 }
			 
			 
			// 3연숙 걸르기
			for(int i=0; i<4; i++) {
	//		1,2,3
	//		2,3,4
	//		3,4,5
	//		4,5,6
	//		4번만 검사하면 됨
				if(randomArray[i]+ 1 == randomArray[i+1] && randomArray[i] + 2 == randomArray[i+2]) {
					System.out.println("걸렸다.: " + randomArray[i] + " : " + randomArray[i+1] + " : " + randomArray[i+2]);
					isLinearNumber = true;
					break;
				} else {
					isLinearNumber = false;
				}
			}
			

			// 문자열로 변환
			randomString = "";
			for (int i=0; i<6; i++) {
				randomString += randomArray[i] + "/";
			}
			randomString = randomString.substring(0, randomString.length()-1);
			
			
			// 기존 번호와 비교
			for (int i=0; i<oldNumber.length; i++) {
				if(randomString.equals(oldNumber[i])) {
					isSameOldNumber = true;
					break;
				} else {
					isSameOldNumber = false;
				}
			}
			
			
			// 최종 판단
			if(isSameNumber || isLinearNumber || isSameOldNumber) {
				System.out.println("다시 시도 해 주세요 : " + randomString);
			} else {
				System.out.println("행운이 있기를 : " + randomString);
			}
			
			System.out.println("");
		
	}
}
