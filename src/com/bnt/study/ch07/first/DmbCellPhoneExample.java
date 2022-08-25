package com.bnt.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		CellPhone cell = new CellPhone();
		cell.powerOn();
		cell.bell();
		cell.endVoice("안녕?");
		cell.receiveVoice("어, 안녕?");
		cell.hangUp();
		cell.powerOff();

		System.out.println("=======자식1=======");

		DmbCellPhone dmb1 = new DmbCellPhone();
		dmb1.powerOn();
		dmb1.bell();
		dmb1.endVoice("안녕?");
		dmb1.receiveVoice("어, 안녕?");
		dmb1.hangUp();
		dmb1.powerOff();

		dmb1.turnOnDmb();
		dmb1.changeChannelDmb(5);
		dmb1.turnOffDmb();

		System.out.println("=======자식2=======");

		DmbCellPhone dmb2 = new DmbCellPhone("갤럭시", "기본색", 1);
		dmb2.powerOn();
		dmb2.bell();
		dmb2.endVoice("안녕?");
		dmb2.receiveVoice("어, 안녕?");
		dmb2.hangUp();
		dmb2.powerOff();

		dmb2.turnOnDmb();
		dmb2.changeChannelDmb(5);
		dmb2.turnOffDmb();
	}
}