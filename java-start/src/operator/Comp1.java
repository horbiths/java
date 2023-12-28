package operator;

//비교 연산자
//두 값을 비교하는데 사용
//주로 뒤에서 설명하는 조건문과 함께 사용
public class Comp1 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		System.out.println(a == b); //false, a와 b는 같지 않다. (== : 같다)
		System.out.println(a != b); //true, a와 b는 다르다. (!= : 다르다)
		System.out.println(a > b); //false, a는 b보다 크지 않다. (> : 크다)
		System.out.println(a < b); //true, a는 b보다 작다. (< : 작다)
		System.out.println(a >= b); //false, a는 b보다 크거나 같지 않다. (>= : 크거나 같다)
		System.out.println(a <= b); //true, a는 b보다 작거나 같다. (<= : 작거나 같다)

		//결과를 boolean 변수에 담을 수 있다.
		boolean result = a == b;
		System.out.println(result);

	}
}
