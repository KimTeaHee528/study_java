package com.bnt.study.ch06;

public class Board2 {

	String name = "김초기";
	int view = 0;
	boolean useNy = true;
	int len = 0;

	Board2(){
	}
	Board2(String name){
		this.name = name;
	}
	Board2(String name, int view){
		this.name = name;
		this.view = view;
	}
	Board2(String name, boolean useNy){
		this.name = name;
		this.useNy = useNy;
	}
	Board2(String name, int view, boolean useNy){
		this.name = name;
		this.view = view;
		this.useNy = useNy;
	}
	public static Board2[] toArr(Board2 a0, Board2 a1, Board2 a2, Board2 a3, Board2 a4) {
		Board2[] bbb = new Board2[5];
		bbb[0] = a0;
		bbb[1] = a1;
		bbb[2] = a2;
		bbb[3] = a3;
		bbb[4] = a4;
		return bbb;
	}
	
	
	
	
	
	public void say() {
		System.out.println("이름: "+name+", 조회수: "+view+", 사용여부: "+useNy);
	}
}