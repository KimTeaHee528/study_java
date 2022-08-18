package com.bnt.study.ch05;

public class asdfasd {
	public static void main(String[] args) {

//============정렬없이================
		int[] num1 = {0,0,0,0,0,0,0};
		int random1;
		for(int i=0; i<7; i++) {
			random1 = (int)(Math.random()*45+1);
			for(int j=0; j<=i; j++) {
				if(random1 == num1[j]) {
					i--;
					break;
				}else if(i==j) {
						num1[i]=random1;
				}else {}
			}
		}
		//출력
		for(int i=0;i<num1.length;i++) {
			if(i<num1.length-1) {
				System.out.print(num1[i] + ",");
			}else {
				System.out.print("보너스" + num1[i]);
			}
		}
		System.out.println("\n");
//============정렬하면서==============
		int[] num2 = {0,0,0,0,0,0,0};
		int random2;
		for(int i=0; i<7; i++) {
			random2 = (int)(Math.random()*45+1);
			for(int j=0; j<=i; j++) {
				if(random2 == num2[j]) {
					i--;
					break;
				}else if(i==j) {
					if(i==6) {
						num2[i] = random2;
					}else {
						int k=i-1;
						while(k>=0 && num2[k]>random2) {
							num2[k+1]=num2[k];
							k--;
						}
						num2[k+1]=random2;
					}
				}else {}
			}
		}
		//출력
		for(int i=0;i<num2.length; i++) {
			if(i<num2.length-1) {
				System.out.print(num2[i] + ",");
			}else {
				System.out.print("보너스" + num2[i]);
			}
		}
		System.out.println("\n");
//============배열번호로================
		int[] num3 = new int[46];
		int aa;
		// 0넣어줌
		for(int i=0; i<=45; i++) {
			num3[i] = 0;
		}
		// 일반번호 6개 선택
		for(int i=0; i<6; i++) {
			aa = (int)(Math.random()*45+1);
			if(num3[aa]==1 || num3[aa]==2) {
				i--;
			}else {
				num3[aa]=1;
			}
		}
		// 보너스번호 1개 선택
		for(int i=0; i<1; i++) {
			aa = (int)(Math.random()*45+1);
			if(num3[aa]==1 || num3[aa]==2) {
				i--;
			}else {
				num3[aa]=2;
			}
		}
		// 출력
		int n=0;
		int b = 0;
		for(int i=0; i<=6; i++) {
			if(num3[n]==1) {
				System.out.print(n+",");
			}else if(num3[n]==2){
				b=n;
			}else {
				i--;
			}
			n++;
		}
		System.out.print("보너스" + b);
	}
}
