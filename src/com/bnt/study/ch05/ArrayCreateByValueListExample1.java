package com.bnt.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scoreEnglish;
		int scoreMath[];
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"김태희","장동건","고소영"};
		System.out.println("===누구===");
		for(int i=0; i<=2; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("===점수평균===");
		int chemistryLength = scoreChemistry.length;
		int totalChemistry=0;
		for(int i=0; i<chemistryLength; i++) {
			totalChemistry += scoreChemistry[i];
		}		
		System.out.println("총합" + totalChemistry);
		System.out.println("평균" + (double)totalChemistry/chemistryLength);
		
		
		System.out.println(avg(scoreChemistry,5));

	}
	public static double avg(int[] score, int aa) {
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		double avg = (double)sum/score.length;
		
		if(aa==3) {
			return avg;
		}else if(aa==2){
			return sum;
		}else if(aa==1) {
			return score.length;
		}else {
			System.out.println("1=길이 / 2=합 / 3=평균");
			return -1;
		}
	}
}
