package com.bnt.study.ch04;

public class ForExample {

	public static void main(String[] args) {
		
		int width = 10;
		int height = 5;
		for(int i = 0; i<height; i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		


		for(int i = 0; i < height; i++) {
			System.out.print("*");
			for(int j = 0; j < width-2; j++) {
				if(i == 0 || i == (height-1)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		System.out.println("");


		int z = height-1;
		int k;
		for(int i = 0; i < height; i++) {
			k=width-1;
			for(int j = 0; j < width; j++) {
				if(i*j*k*z == 0) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				k--;
			}
			z--;
			System.out.println("");
		}
		System.out.println("");

		
		for(int i = 1; i <= 11; i++) {
			for(int j = 1; j < i; j++) {
				if(j%2==0 && i==11 && j!=10) {
					System.out.print(" ");
				}else {
					System.out.print(j%10);
				}
			}
			System.out.println("");
		}
		
		


		        int N = (int)(Math.random()*9+1);
		        System.out.println(N);
		        for(int i=0;i<=N;i++){
		            for(int j=N; j>0;j--) {
		            	if(j<=i) {
		            		System.out.print("*");
		            	}else {
		            		System.out.print(" ");
		            	}
		            }
		            System.out.println("");
		        }
		        


		
		
		
		
	}
}


