package com.bnt.study.ch07.fifth;

public class sumExample {

	public static void main(String[] args) {
		Sum sum = new Sum();
		Sum2 sum2 = new Sum2();
		int arr[]= {40,20,30};
		
		System.out.println(arr);
		sum.sort(arr);
		sum.printArr(arr);
		
		System.out.println(sum.sumvalue(arr));
		System.out.println(sum2.sumvalue(arr));
		
		System.out.println(sum.sumvalue(arr)-sum2.sumvalue(arr));
		
	}

}
