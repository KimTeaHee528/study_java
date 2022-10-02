package com.bnt.study.ch13.first;

import java.util.Scanner;

public class Box<T> {

	private T t;
	
	public T get() {
		return t;
	}
	public void set() {
		Scanner scanner = new Scanner(System.in);
		this.t = (T) scanner.next();
		out(t);
	}
	public void out(T t) {
		System.out.println("output : " + t);
	}
}
