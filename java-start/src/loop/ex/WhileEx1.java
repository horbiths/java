package loop.ex;

//자연수 출력
//처음 10개의 자연수를 출력하는 프로그램
//count라는 변수를 사용
//while문, for문 2가지 버전의 정답을 만듦

public class WhileEx1 {

	public static void main(String[] args) {
		int count = 1;

		while (count <= 10) {
			System.out.println(count);
			count++;
		}

//		for (int count = 1; count <= 10; count++) {
//			System.out.println(count);
//		}
	}
}
