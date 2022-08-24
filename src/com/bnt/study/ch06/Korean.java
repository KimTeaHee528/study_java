package com.bnt.study.ch06;

public class Korean {
	String name;
	String ssn;
	String na;
	static String nationality = "대한민국";
	int age;
	static int aa = 0;
	Korean(String name, String ssn){
		if(ssn.length()==14) {
			this.name = name;
			this.ssn = ssn;
		}else {
			this.name = name;
			this.na = ssn;
		}
	}
	Korean(String name, int age){
		this.name = name;
		this.age = age;
	}
	Korean(){
	}
	static int staticTest(int a) {
		aa = a +10;
		return aa;
	}
	public void tttt() {
		Arithmetic.sstest();
	}
	
	
}
