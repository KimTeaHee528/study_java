package com.bnt.study.ch06;

public class CarThird {
	String name = "아반떼";
	String color;
	int cc = 0;
	CarThird(String name){
		this.name = name;
	}
	CarThird(String name, int cc){
		this.name = name;
		this.cc = cc;
	}
	CarThird(String name, int cc, String color){
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	CarThird(){
	}
	public void say() {
		System.out.println("============");
		System.out.println("이름: " + name);
		System.out.println("색상: " + color);
		System.out.println("CC: " + cc);
	}
}
