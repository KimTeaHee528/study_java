package com.bnt.study.ch06;

public class Arithmetic {
	private String[] title = {"더하기","빼기","곱하기","나누기"};
	private int[] result = new int[4];
	
	private int intVal1;
	private int intVal2;
	
	public void insert(int a, int b) {
		this.intVal1 = a;
		this.intVal2 = b;
	}
	public void calculate() {
		result[0] = intVal1+intVal2;
		result[1] = intVal1-intVal2;
		result[2] = intVal1*intVal2;
		result[3] = intVal1/intVal2;
		say();
	}
	public int sum(int a, int b) {
		result[0] = a+b;
		return result[0];
	}	
	public int sub(int a, int b) {
		result[1] = a-b;
		return result[1];
	}	
	public int mul(int a, int b) {
		result[2] = a*b;
		return result[2];
	}
	public int div(int a, int b) {
		result[3] = a/b;
		return result[3];
	}
	public void say() {
		for(int i =0; i<title.length; i++) {
			System.out.println(title[i]+": "+result[i]);
		}
	}
	
	static void sstest() {
		System.out.println("sdafgvaresdgbvrd");
	}
}
