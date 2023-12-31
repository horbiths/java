package cond;

//else문은 if문에서 만족하는 조건이 없을 때 실행하는 코드를 제공
public class If2 {

	public static void main(String[] args) {
		/*
		if (condition) {
			조건이 참일 때 실행되는 코드
		} else {
			만족하는 조건이 없을 때 실행되는 코드
		}
		 */

		int age = 20; // 사용자의 나이

		if (age >= 18) {
			System.out.println("성인입니다."); //참일 때 실행
		} else {
			System.out.println("미성년자입니다."); //만족하는 조건이 없을 때 실행
		}
	}
}
