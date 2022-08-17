package com.bnt.study.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		
		int[] arr2 ;
		arr2 = new int[5];

		arr1[0] = 77;
		System.out.println("arr[0]: " + arr1[0]);
		arr1[1] = 50;
		System.out.println("arr[1]: " + arr1[1]);
		arr1[2] = 5;
		System.out.println("arr[2]: " + arr1[2]);
		
		System.out.println(arr1.length);
		
		
		
	}

}
