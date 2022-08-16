package com.bnt.study.ch04;

public class RandomSum {

	public static void main(String[] args) {

		int min = 1;
		int max = 100;
		int random1 = (int) ( (Math.random() * (max-min)) + min );
		int random2 = (int) ( (Math.random() * (max-min)) + min );
		int result=0;
		if(random1>random2) {
			for(int i=random2 ; i <= random1 ; i++) {
				result += i;
			}
		}else if(random1<random2){
			for(int i=random1 ; i <= random2 ; i++) {
				result += i;
			}
		}else {
			result = random1;
		}
		System.out.println(random1 + "," + random2+" >>> "+result);
		

		
		System.out.println("=============검산=================");
		int min1;
		int max1;
		if(random1 < random2) {
			min1 = random1;
			max1 = random2;
		}else{
			min1 = random2;
			max1 = random1;
		}
		int resultA = (max1+min1)*(max1-min1+1)/2;
		System.out.println("random1 : "+ random1);
		System.out.println("random2 : "+ random2);
		System.out.println("최소값 : "+ min1);
		System.out.println("최대값 : "+ max1);
		System.out.println("검산 : "+resultA);
		
		
		System.out.println("==============정답================");
		//최대 최소값을 먼저 찾고 포문은 하나만하는게 가독성이 좋음!!!

//		double num1 = 1.0;
//		double num2 = 100.0;
//		
//		int sum = 0, min = 0, max = 0;
//		
//		int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
//		int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
//		
//		if (random1 < random2) {
//			max = random2;
//			min = random1;
//		} else {
//			max = random1;
//			min = random2;
//		}
//		
//		System.out.println("min : " + min + ", " + "max : " + max);
//		
//		for (int i = min; i <= max; i++) {
//			sum += i;
//			System.out.println(i + " : " + sum);
//		}
//		
//		System.out.println("total : " + sum);
//
//		
		
		
		
		
		
//		여기서 부터 정민님 소스
//		Random rand = new Random();
//		
//		int num1 = rand.nextInt(100);
//		int num2 = rand.nextInt(100);
//		
//		int sum = 0;
//		
//		if(num1 > num2) {
//			for(int i = num2 ; i <= num1; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num1) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
//		} else {
//			for(int i = num1 ; i <= num2; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num2) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
////			System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
//		}

	}
}
