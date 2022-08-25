package com.bnt.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		System.out.println("======부모=====");
		CellPhone cellPhone = new CellPhone();
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.bell();
		cellPhone.endVoice("가나다");
		cellPhone.receiveVoice("ABC");
		cellPhone.hangUp();

		System.out.println("======자식 매소드=====");
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시", "기본색", 10);
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(8);
		dmbCellPhone.turnOffDmb();

		System.out.println("======자식->부모 매소드=====");
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.receiveVoice("ABC");
		dmbCellPhone.endVoice("가나다");
		dmbCellPhone.hangUp();
	}
}