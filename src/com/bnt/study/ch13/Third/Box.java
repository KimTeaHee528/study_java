package com.bnt.study.ch13.Third;

public class Box<T> {

	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	public void out () {
		System.out.println("output");
	}
}
