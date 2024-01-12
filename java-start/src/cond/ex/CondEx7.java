package cond.ex;

//홀수 짝수 찾기
//정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 홀수이면 "홀수"를 출력하는 프로그램을 작성
//삼항 연산자를 사용
//참고로 x % 2를 사용하면 홀수, 짝수를 쉽게 계산

//출력 예시
//x: 2
//출력: x = 2, 짝수
public class CondEx7 {

	public static void main(String[] args) {
		int x = 3;
		String result = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x = " + x + ", " + result);
	}

}
