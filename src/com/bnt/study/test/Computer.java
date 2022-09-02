package com.bnt.study.test;

public class Computer extends Calculator {

	@Override
	public Double Cal_area(Double R1) {
		Double area = Constants.PAI_2*R1*R1;
		return area;
	}
}
