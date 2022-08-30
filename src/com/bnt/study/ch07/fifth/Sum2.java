package com.bnt.study.ch07.fifth;

public class Sum2 extends Sum{

	int result;
	
	@Override
	public int sumvalue(int arr[]) {
		result = arr[0] * arr[1] + arr[2] + 10;
		return result;
	}


}
