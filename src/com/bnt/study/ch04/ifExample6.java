package com.bnt.study.ch04;

public class ifExample6 {
	
	public static void main(String[] args) {
		
		int a=7;
		int b=7;
		int c=7;
		
		if(a==b) {
			if(a>c) {
				System.out.println("최대값:a,b / 최소값:c");
			}else if(a<c) {
				System.out.println("최대값:c / 최소값:a,b");
			}else {
				System.out.println("a=b=c");
			}
		}else if(a==c) {
			if(a>b) {
				System.out.println("최대값:a,c / 최소값:b");
			}else {
				System.out.println("최대값:b / 최소값:a,c");
			}
		}else if(b==c) {
			if(a>b) {
				System.out.println("최대값:a / 최소값:b,c");
			}else{
				System.out.println("최대값:b,c / 최소값:a");
			}
		}else if(a>b) {
			if(a>c) {
				if(b>c) {
					System.out.println("최대값:a / 최소값:c");
				}else {
					System.out.println("최대값:a / 최소값:b");
				}
			}else if(a<c){
					System.out.println("최대값:c / 최소값:b");
			}
		}else if(a<b) {
			if(a>c) {
					System.out.println("최대값:b / 최소값:c");
			}else if(a<c){
				if(b<c) {
					System.out.println("최대값:c / 최소값:a");
				}else {
					System.out.println("최대값:b / 최소값:a");
				}
			}
		}
	}
}

