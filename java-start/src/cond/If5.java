package cond;

//else if문
//앞선 if문의 조건이 거짓일 때 다음 조건을 검사한다. 만약 앞선 if문이 참이라면 esle if를 실행하지 않는다.
public class If5 {

	public static void main(String[] args) {
		/*
		if (condition1) {
			조건1이 참일 때 실행되는 코드
		} else if (condition2) {
			조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
		} else if (condition3) {
			조건2이 거짓이고, 조건3이 참일 때 실행되는 코드
		} else {
			모든 조건이 거짓일 때 실행되는 코드
		}
		
		순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면 딱 1개만 실행
		else는 생략할 수 있다.
		 */

		int age = 13;

		if(age <= 7) { //~7 : 미취학
			System.out.println("미취학");
		} else if (age <= 13) { //8~13 : 초등학생
			System.out.println("초등학생");
		} else if (age <= 16) { //14~16 : 중학생
			System.out.println("중학생");
		} else if (age <= 19) { //17~19 : 고등학생
			System.out.println("고등학생");
		} else { //20~ : 성인
			System.out.println("성인");
		}
	}
}
