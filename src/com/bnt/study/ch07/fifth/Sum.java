package com.bnt.study.ch07.fifth;

public class Sum {
	int result;
	int[] arr = new int[3];
	
	public void sort(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length - 1; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[1];
					arr[i]= arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public int sumvalue(int arr[]) {
		result = arr[0] * arr[1] + arr[2];
		return  result;
	}
	
	public void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}
