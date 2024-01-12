package cond;

//Switch1에서의 코드를 switch문으로 변경해서 작성
public class Switch2 {

	public static void main(String[] args) {
		// 1 = 1000 2= 2000 3 = 3000 나머지 : 500
		int grade = 1;

		int coupon;
		switch (grade) {
			case 1: // grade == 1
				coupon = 1000;
				break;
			case 2: // grade == 2
				coupon = 2000;
				break;
			case 3: // grade == 3
				coupon = 3000;
				break;
			default:
				coupon = 500;
				break;
		}
		System.out.println("발급받은 쿠폰 " + coupon);

	}
}
