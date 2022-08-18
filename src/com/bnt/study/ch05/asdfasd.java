package com.bnt.study.ch05;

public class asdfasd {

	public static void main(String[] args) {
//		int[] num = new int[46];
//		int aa;
//		// 0넣어줌
//		for(int i=0; i<=45; i++) {
//			num[i] = 0;
//		}
//		// 일반번호 6개 선택
//		for(int i=0; i<6; i++) {
//			aa = (int)(Math.random()*45.9+1);
//			if(num[aa]==1 || num[aa]==2) {
//				i--;
//			}else {
//				num[aa]=1;
//			}
//		}
//		// 보너스번호 1개 선택
//		for(int i=0; i<1; i++) {
//			aa = (int)(Math.random()*45.9+1);
//			if(num[aa]==1 || num[aa]==2) {
//				i--;
//			}else {
//				num[aa]=2;
//			}
//		}
//		int j=0;
//		int b = 0;
//		for(int i=0; i<=6; i++) {
//			if(num[j]==1) {
//				System.out.print(j+",");
//			}else if(num[j]==2){
//				b=j;
//			}else {
//				i--;
//			}
//			j++;
//		}
//		System.out.print("보너스" + b);
		
		
		int[] asdf = {-1,-1,-1,-1,-1,-1,-1};
		int random;
		for(int i=0; i<6; i++) {
			random = (int)(Math.random()*45+1);
			for(int j=0; j<=i;j++) {
				if(random==asdf[j]) {
					i--;
				}else {
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int dd = 0;
//		int aaaa= 0;
//		while(dd != 3) {
//			aaaa++;
//			dd=(int)(Math.random()*2+1);
//			System.out.print(dd);
//			System.out.println("   "+aaaa);
//		}
	}
}
