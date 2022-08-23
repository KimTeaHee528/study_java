package com.bnt.study.ch06;

public class CarThirdExample {

	public static void main(String[] args) {
		CarThird carThird1 = new CarThird("모닝");
		CarThird carThird2 = new CarThird("소울",3000);
		CarThird carThird3 = new CarThird("레이",2000,"black");
		carThird1.say();
		carThird2.say();
		carThird3.say();

		
//		CarThird[] carThird4 = new CarThird[3];
//		carThird4[0].cc = 5555;
//		for(int i=0; i<carThird4.length; i++) {
//			System.out.println(carThird4[i].cc);
//		}
	}
}