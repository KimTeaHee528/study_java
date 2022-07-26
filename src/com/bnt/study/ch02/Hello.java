package com.bnt.study.ch02;

public class Hello {

	public static void main(String[] args) {

//		데이터 타입 변수명 = 값;
//		데이터 타입 변수명
//		int width = 100;
		String name = "김태희";
//		상세화면
		String title = "트랜스포머 범블비 옵티머스 로봇변신 무선조종 RC카";
		int price = 41500;
		boolean oversea = true;
		int discount = 0;
		int discointType = 0;
		int totalPrice = 0;
		int option = 0;
		boolean like = false;
		String link = "www.sdlkfnsl.com/fdahb";
		String orderLink = "www.fdokngvfdl.com/fdagdf";
		String basketLink = "www.fdndlfg.com/sdfs";
		String imgLink = "www.dfogn.com/sfdgvdf";
		String detailLink = "www.sdfsf.com/sdgsfs";
		
		System.out.println("name에 들어가있는 값은" + name);
		System.out.println("-------------상세화면 내용-------------");
		System.out.println("상품 화면 링크 " + link);
		System.out.println("타이틀 " + title);
		System.out.println("이미지 링크 " + imgLink);
		System.out.println("상품설명 링크 " + detailLink);
		System.out.println("가격" + price);
		System.out.println("할인종류 " + discount + "   할인금액 " + discointType);
		System.out.println("해외배송 " + oversea);
		System.out.println("옵션 " + option);
		System.out.println("좋아요 선택 " + like);
		System.out.println("총 가격 " + totalPrice);
		System.out.println("바로구매 링크 " + orderLink);
		System.out.println("장바구니 링크 " + basketLink);
		
	}
}
