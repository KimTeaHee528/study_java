package com.bnt.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		String grade = "플래티넘";
		int price = 10000;
		
		switch(grade) {
		case "일반":
			System.out.println(grade+(price*0.95));
			break;
		case "브론즈":
			System.out.println(grade+(price*0.9));
			break;
		case "실버":
			System.out.println(grade+(price*0.85));
			break;
		case "골드":
			System.out.println(grade+(price*0.8));
			break;
		case "플래티넘":
			System.out.println(grade+(price*0.975));
			break;
		}
	}
}
