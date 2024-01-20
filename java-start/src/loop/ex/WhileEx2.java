package loop.ex;

//짝수 출력
//반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램
//num이라는 변수를 사용하여 수를 표현
//while문, for문 2가지 버전의 정답

public class WhileEx2 {

	public static void main(String[] args) {
		int num = 2;
		int count = 1;

		while (count <= 10) {
			System.out.println(num);
			num += 2;
			count++;
		}

//		for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//			System.out.println(num);
//		}
	}
}
