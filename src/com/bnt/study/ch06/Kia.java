package com.bnt.study.ch06;

public class Kia {
	private String[] name = new String[3];
	
	public void setName(int i,String aaa) {
		this.name[i] = aaa;
	}
	public void print() {
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
