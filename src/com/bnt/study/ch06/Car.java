package com.bnt.study.ch06;

public class Car {

	int a = 1;
	private String name = "아방이";
	String[] name2 = {"김태희", "고소영"};
	private String name3;


	
	public String getname() {
		return name;
	}
	public String setname(String name) {
		return this.name = name;
	}
	public String setname2(String name) {
		return this.name3 = name;
	}
	public void pr() {
		System.out.println(name3);
	}
	
}
