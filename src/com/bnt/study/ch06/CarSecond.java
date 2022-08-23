package com.bnt.study.ch06;

public class CarSecond {

	String color = "red";
	int cc = 1500;
	CarSecond(){
	}
	CarSecond(String str){
		this.color=str;
	}
	CarSecond(int cc){
		this.cc = cc;
	}
	CarSecond(String str, int cc){
		this.color=str;
		this.cc = cc;
	}
}
