package com.bnt.study.ch13.first;

import java.util.Scanner;

public class BoxExample {
	public static void main(String[] args) {
		
		boolean loop = true;
		
		while(loop) {
			Box<String> box = new Box<String>();
			System.out.println("=====스트링=====");
			box.set();
			String str = box.get();
			
			Box<Integer> box2 = new Box<Integer>();
			System.out.println("=====인티저=====");
			box2.set();
			
			Box<Double> box3 = new Box<Double>();
			System.out.println("=====더블=====");
			box3.set(); // set으로 데이터를 받아서
			
			Scanner scan = new Scanner(System.in);
			loop = scan.nextBoolean();
		}
	}
}