package com.bnt.study.ch07.fifth;

public abstract class Phone {
	
	//필드
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//기본생성자
	Phone() {
	}
	
	public void trunOn() {
		System.out.println(owner +"가 폰 전원을 켭니다.");
	}
	public void trunOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}