package operator;

//연산자 우선순위
public class Operator3 {

	public static void main(String[] args) {
		int sum1 = 1 + 2 * 3; //1 + (2 * 3)
		int sum2 = (1 + 2) * 3;
		System.out.println("sum1 = " + sum1); // 연산자 우선순위에 의해 곱셈이 먼저 계산된 것이다.
		System.out.println("sum2 = " + sum2);
		//연산자 우선순위를 변경하려면 수학과 마찬가지로 괄호()를 사용하면 된다.


	}
}
