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
		return this.setName3(name);
	}
	public void pr() {
		System.out.println(name);
	}
	public String getName3() {
		return name3;
	}
	public String setName3(String name3) {
		this.name3 = name3;
		return name3;
	}
	
}
