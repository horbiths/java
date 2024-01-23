package casting;

public class Casting1 {

	public static void main(String[] args) {
		//작은 범위에서 큰 범위에 값을 대입하는 코드
		int intValue = 10;
		long longValue;
		double doubleValue;

		longValue = intValue; // int -> long
		System.out.println("longValue = " + longValue); //longValue = 10

		doubleValue = intValue; // int -> double
		System.out.println("doubleValue1 = " + doubleValue); //doubleValue1 = 10.0

		doubleValue = 20L; // long -> double
		System.out.println("doubleValue2 = " + doubleValue); //doubleValue2 = 20.0
	}
}

//자바는 기본적으로 같은 타입에 값을 대입할 수 있다. 그런데 다른 타입에 값을 대입하면 어떻게 될까?
//int -> long을 비교해보면 long이 int보다 더 큰 숫자 범위를 표현한다. 작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입을 하면 문제가 되지 않는다.
//long -> double의 경우에도 double은 부동 소수점을 사용하기 때문에 더 큰 숫자 범위를 표현한다. 따라서 대입할 수 있다.
//정리하면 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용한다. 쉽게 이야기하면 큰 그릇은 작은 그릇에 담긴 내용물을 담을 수 있다.