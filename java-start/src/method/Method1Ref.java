package method;

//자바에서 함수를 method라 한다.

public class Method1Ref {

	public static void main(String[] args) {
		int sum1 = add(5, 10);
		System.out.println("결과1 출력 : " + sum1);

		int sum2 = add(15, 20);
		System.out.println("결과2 출력 : " + sum2);

		add(100, 200); //반환 값 무시, 연산만 수행하고 반환 값은 안 받는 것
	}

	//add method
	public static int add(int a, int b) {
		System.out.println(a + " + " + b + " 연산 수행");
		int sum = a + b;
		return sum;
	}
	//method는 무언가 정의해두고 필요할 때 불러서 사용한다.
}
