package com.bnt.study.ch06;

public class HyundaiMotorExample {

	public static void main(String[] args) {
		
		HyundaiMotor hyundaiMotor = new HyundaiMotor();
		
		for(int i=0; i<hyundaiMotor.name.length; i++) {
			System.out.println(hyundaiMotor.name[i]);
		}
		
		int sum = hyundaiMotor.sum(4,5);
		System.out.println(sum);
	}

}
