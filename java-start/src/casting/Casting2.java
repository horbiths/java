package casting;

//명시적 형변환
//큰 범위에서 작은 범위 대입은 명시적 형변환이 필요
//double은 실수를 표현할 수 있다. 따라서 1.5가 가능하다. 그런데 int는 실수를 표현할 수 없다. 이경우 double -> int로 대입하면 어떻게 될까?

public class Casting2 {

	public static void main(String[] args) {
		double doubleValue = 1.5;
		int intValue = 0;

		//intValue = doubleValue; //컴파일 오류 발생
		intValue = (int) doubleValue; //형변환
		System.out.println(intValue); //출력 : 1
	}
}

/*
int형은 double형보다 숫자의 표현 범위가 작다. 그리고 실수를 표현할 수도 없다. 따라서 이 경우 숫자가 손실되는 문제가 발생할 수 있다.
이런 문제는 매우 큰 버그를 유발할 수 있다. 그래서 자바는 이런 경우 컴파일 오류를 발생시킨다. 항상 강조하지만 컴파일 오류는 문제를 가장 빨리 발견할 수 잇는 좋은 오류이다.
 */
