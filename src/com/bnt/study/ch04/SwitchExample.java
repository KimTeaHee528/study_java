package com.bnt.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 7;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("다른게 나왔습니다.");
				break;
		}
		
		String position = "사원";
		
		switch (position) {
			case "사원":
				System.out.println("연봉 10억");
				break;
			case "대리":
				System.out.println("연봉 20억");
				break;
			case "과장":
				System.out.println("연봉 30억");
				break;
			case "부장":
				System.out.println("연봉 40억");
				break;
			case "사장":
				System.out.println("연봉 50억");
				break;
			default:
				System.out.println("다시입력하세요.");
		
		}
	}

}
