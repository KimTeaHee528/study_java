package com.bnt.study.ch04;

public class ifExample {
	
	public static void main(String[] args) {
		
		int score = 59;
		score(score);
		
	}
	
	public static void score(int score) {
		if(score >= 90) {
			if(score >= 98) {
				System.out.println("A+");
			}else if(score < 92){
				System.out.println("A-");
			}else {
				System.out.println("A");
			}
		} else if(score>=80){
			if(score >= 88) {
				System.out.println("B+");
			}else if(score < 82){
				System.out.println("B-");
			}else {
				System.out.println("B");
			}
		} else if(score>=70){
			if(score >= 78) {
				System.out.println("C+");
			}else if(score < 72){
				System.out.println("C-");
			}else {
				System.out.println("C");
			}
		} else if(score>=60){
			if(score >= 68) {
				System.out.println("D+");
			}else if(score < 62){
				System.out.println("D-");
			}else {
				System.out.println("D");
			}
		} else{
			System.out.println("F");
		}
	}
}
