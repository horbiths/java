package cond;

//if문과 else if문
//if문에 else if를 함께 사용하는 것은 서로 연관된 조건일 때 사용
//서로 관련이 없는 독립 조건이면 else if를 사용하지 않고 if문을 각각 따로 사용
public class If6 {

	public static void main(String[] args) {
		/*
		예시1. if-else 사용 : 서로 연관된 조건이어서, 하나로 묶을 때
		if (condition1) {
			작업1 수행
		} else if (condition2) {
			작업2 수행
		}

		예시2. if 각각 사용 : 독립 조건일 때
		if (condition1) {
			작업1 수행
		}
		if (condition2) {
			작업2 수행
		}

		예시1은 작업1, 작업2 둘 중 하나만 수행
		예시2는 조건만 맞다면 둘 다 수행
		 */

		//문제
		//온라인 쇼핑몰의 할인 시스템을 개발해야 한다.
		//한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
		//각각의 할인 조건은 다음과 같다.
		//아이템 가격이 10000원 이상일 때, 1000원 할인
		//나이가 10살 이하일 때 1000원 할인
		//이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다.

		int price = 10000; // 아이템 가격
		int age = 10; // 나이
		int discount = 0; //할인

		if (price >= 10000) {
			discount += 1000;
			System.out.println("10000원 이상 구매시 1000원 할인");
		}

		if (age <= 10) {
			discount += 1000;
			System.out.println("10살 이하면 1000원 할인");
		}

		System.out.println("총 할인 금액 : " + discount + "원");
	}
}
