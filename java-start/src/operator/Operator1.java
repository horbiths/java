package operator;

//연산자(operator) : 연산 기호 예) +, -
//피연산자(operand) : 연산 대상 예) 3, 4, a, b
public class Operator1 {

	public static void main(String[] args) {
		//산술 연산자 +, -, *, /, %
		//%는 나머지, /는 나누기

		//변수 초기화
		int a = 5;
		int b = 2;

		// 덧셈
		int sum = a + b;
		System.out.println("a + b = " + sum); //출력 a + b = 7
		// ""는 문자열, 그 뒤에 숫자 같은 것을 출력하고 싶으면 +를 넣어주면 된다.

		// 뺄셈
		int diff = a - b;
		System.out.println("a - b = " + diff);

		// 곱셈
		int multi = a * b;
		System.out.println("a * b = " + multi);

		// 나눗셈
		int div = a / b; //int형 끼리의 계산은 소수점 표현이 안돼서 2만 출력된다.
		System.out.println("a / b = " + div);

		// 나머지
		int mod = a % b;
		System.out.println("a % b = " + mod);

		// int z = 10 / 0;
		// 숫자는 0으로 나눌 수 없다.
		// 실행하면 Exception in thread "main" java.lang.ArithmeticException: / by zero 예외가 발생한다.
	}
}
