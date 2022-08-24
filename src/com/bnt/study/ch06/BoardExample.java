package com.bnt.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		Board2 board0 = new Board2();
		Board2 board1 = new Board2("김태희1");
		Board2 board2 = new Board2("김태희2", 5);
		Board2 board3 = new Board2("김태희3", false);
		Board2 board4 = new Board2("김태희4", 10, false);

		board0.say();
		board1.say();
		board2.say();
		board3.say();
		board4.say();
	}
}