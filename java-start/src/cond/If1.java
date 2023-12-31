package cond;

//특정 조건에 따라서 다른 코드를 실행하는 것을 조건문이라 한다.
//조건문에는 If문, switch문이 있다.

public class If1 {

	public static void main(String[] args) {
		//If문은 특정 조건이 참인지 확인하고, 그 조건이 참일 경우 특정 코드 블럭을 실행
		/*If (condition) {
			//조건이 참일 때 실행되는 코드
		}
		 */

		int age = 20; // 사용자 나이

		if (age >= 18) {
			System.out.println("성인입니다."); // age의 값은 20이라 조건이 참으로 판명되어 코드 블럭이 실행
		}

		if (age < 18) {
			System.out.println("미성년자입니다."); // 조건이 거짓으로 판명되어 코드 블럭이 실행x
		}
	}
}
