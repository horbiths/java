package cond;

//문제
//회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성
//int grade 변수 사용
//grade(회원 등급)에 따라 다음의 쿠폰을 발급
//1등급 : 쿠폰 1000
//2등급 : 쿠폰 2000
//3등급 : 쿠폰 3000
//위의 등급이 아닐 경우 : 쿠폰 500
//각 쿠폰이 할당된 후에는 "발급받은 쿠폰 " + 쿠폰값을 출력
public class Switch1 {
	//if 문을 사용
	public static void main(String[] args) {
		// 1 = 1000 2= 2000 3 = 3000 나머지 : 500
		int grade = 1;

		int coupone;
		if (grade == 1) {
			coupone = 1000;
		} else if (grade == 2) {
			coupone = 2000;
		} else if (grade == 3) {
			coupone = 3000;
		} else {
			coupone = 500;
		}

		System.out.println("발급받은 쿠폰" + coupone);
	}
}
