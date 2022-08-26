package com.bnt.study.ch07.forth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		System.out.println("===============");
		SupersonicAirplane supersonicAirplane2 = new SupersonicAirplane();
		supersonicAirplane2.takeoff();
		supersonicAirplane2.fly();
		supersonicAirplane2.flyMode = Constants.SUPERSONIC;
		supersonicAirplane2.fly();
		supersonicAirplane2.flyMode = Constants.NORMAL;
		supersonicAirplane2.fly();
		supersonicAirplane2.land();
	}
}
