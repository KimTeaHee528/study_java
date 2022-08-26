package com.bnt.study.ch07.forth;

public class SupersonicAirplane extends Airplane {
	public static final int normal = 1;
	public static final int supersonic = 2;
	public int flyMode = normal;
	@Override
	public void fly() {
		if(flyMode == supersonic) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
	}
	
	
}
