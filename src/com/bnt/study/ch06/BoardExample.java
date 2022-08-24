package com.bnt.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		Board2 board0 = new Board2();
		Board2 board1 = new Board2("김태희1");
		Board2 board2 = new Board2("김태희2", 5);
		Board2 board3 = new Board2("김태희3", false);
		Board2 board4 = new Board2("김태희4", 10, false);
		Board2[] b = new Board2[5];
		b = Board2.toArr(board0, board1, board2, board3, board4);
		for(int i=0; i<b.length; i++) {
			b[i].say();
		}
	}
}