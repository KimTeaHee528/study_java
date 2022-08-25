package com.bnt.study.ch07.first;

public class DmbCellPhone extends CellPhone {
	int channel;

	DmbCellPhone() {
	}

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println(channel + "번 채널 수신 시작");
	};

	void turnOffDmb() {
		System.out.println("DMB 종료");
	};

	void changeChannelDmb(int channel) {
		System.out.println(this.channel + "번 채널을 " + channel + "번 채널로 변경");
		this.channel = channel;
	};
}