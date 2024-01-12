package cond;

//break문이 없으면?
public class Switch3 {

	public static void main(String[] args) {
		//비지니스 요구사항이 2등급도 3등급과 같이 3000원 쿠폰을 준다고 변경

		// 1 = 1000 2= 3000(변경) 3 = 3000 나머지 : 500
		int grade = 2;
		int coupon;
		switch (grade) {
			case 1: // grade == 1
				coupon = 1000;
				break;
			case 2: // grade == 2
			case 3: // grade == 3
				coupon = 3000;
				break;
				//2에 break가 없어서 3의 break까지 실행이 된다.
			default:
				coupon = 500;
				break;
		}
		System.out.println("발급받은 쿠폰 " + coupon);

	}
}
