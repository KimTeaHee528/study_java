package com.bnt.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] tr = {{100,92,95},{80,75,60},{88,77,66},{55,65,45},{80,95,100}};
		String[] name = {"장원영","장동건","고소영","박태환","싸이"};
		String[] subject = {"국어","영어","수학"};
		
		System.out.println("====개인별 평균=======");
		for(int i = 0; i<tr.length; i++) {
			int sum = 0;
			for(int j = 0; j<tr[0].length; j++) {
				sum += tr[i][j];
			}
			System.out.println(name[i] + ": " + (double) sum/tr[0].length);
		}
		System.out.println("====과목별 평균=======");
		for(int i = 0; i<tr[0].length; i++) {
			int sum = 0;
			for(int j = 0; j<tr.length; j++) {
				sum += tr[j][i];
			}
			System.out.println(subject[i] + ": " + (double) sum/tr.length);
		}


		
		System.out.println("====한번에 평균=======");
		
		int[] pSum= {0,0,0,0,0};
		int[] sSum= {0,0,0};
		for(int i=0; i<tr.length; i++) {
			for(int j = 0; j<tr[0].length; j++) {
				pSum[i] += tr[i][j];
				sSum[j] += tr[i][j];
			}
		}
		System.out.println("학생별====");
		for(int i=0; i<pSum.length; i++) {
			System.out.println(name[i]+"의 평균 : "+(double)pSum[i]/sSum.length);
		}
		System.out.println("과목별====");
		for(int i=0; i<sSum.length; i++) {
			System.out.println(subject[i]+" 평균 : "+(double)sSum[i]/pSum.length);
		}
	}
}
