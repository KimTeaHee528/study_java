package com.bnt.study.ch04;

public class ifExample5 {
	
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		f1(x,y);
		
		
		int xx = 1;
		int yy = 0;
		if(xx>0 && yy>0) {
			System.out.println("2. (x,y)는 1사분면에 위치합니다.");
		}else if(xx<0 && yy>0) {
			System.out.println("2. (x,y)는 2사분면에 위치합니다.");
		}else if(xx<0 && yy<0) {
			System.out.println("2. (x,y)는 3사분면에 위치합니다.");
		}else if(xx>0 && yy<0) {
			System.out.println("2. (x,y)는 4사분면에 위치합니다.");
		}else if(xx==0 && yy!=0) {
			System.out.println("2. (x,y)는 x축위에 위치합니다.");
		}else if(xx!=0 && yy==0) {
			System.out.println("2. (x,y)는 y축위에 위치합니다.");
		}else {
			System.out.println("2. (x,y)는 원점입니다.");
		}
	}
	public static void f1(int x, int y) {
		if(y<0) {
			if(x<0) {
				System.out.println("3사분면");
			}else if(x>0) {
				System.out.println("4사분면");
			}else {
				System.out.println("y축 아래쪽");
			}
		}else if(y>0) {
			if(x<0) {
				System.out.println("2사분면");
			}else if(x>0) {
				System.out.println("1사분면");
			}else {
				System.out.println("y축 위쪽");
			}
		}else {
			if(x<0) {
				System.out.println("x축 왼쪽");
			}else if(x>0) {
				System.out.println("x축 오른쪽");
			}else {
				System.out.println("원점");
			}
		}
	}
}

