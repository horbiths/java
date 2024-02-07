package method;

//메서드 호출과 값 복사
//숫자를 2배 곱하는 메서드

public class MethodValue1 {

	public static void main(String[] args) {
		int num1 = 5;
		System.out.println("1. changeNumber 호출 전, num1: " + num1);
		changeNumber(num1); //changeNumber를 호출한다. num1(5)
		System.out.println("4. changeNumber 호출 후, num1: " + num1); //메서드에서 연산을 해도 num1이 바뀌는 것은 아니다.
	}

	public static void changeNumber(int num2) { //num1의 값 5가 num2에 복사된다. num1(5), num2(5)
		System.out.println("2. changeNumber 변경 전, num2: " + num2);
		num2 = num2 * 2; //num2에 2를 곱한다. num1(5), num2(10)
		System.out.println("3. changeNumber 변경 후, num2: " + num2);
	}
}
