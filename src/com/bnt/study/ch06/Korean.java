package com.bnt.study.ch06;

public class Korean {
	String name;
	String ssn;
	String na;
	int age;
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
}
