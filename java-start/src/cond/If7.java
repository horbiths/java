package cond;

public class If7 {

	public static void main(String[] args) {
		int price = 10000; // 아이템 가격
		int age = 10; // 나이
		int discount = 0; //할인

		if (price >= 10000) {
			discount += 1000;
			System.out.println("10000원 이상 구매시 1000원 할인");
		} else if (age <= 10) {
			discount += 1000;
			System.out.println("10살 이하면 1000원 할인");
		} else {
			System.out.println("할인 없음");
		}

		System.out.println("총 할인 금액 : " + discount + "원");
	}
	//else if 사용 시 할인이 중복으로 적용이 안된다.

	//if문 다음에 실행할 명령이 하나의 문장만 있는 경우 {}를 생략할 수 있다.
}
