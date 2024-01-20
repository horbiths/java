package loop.ex;

//누적 합 계산
//반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램
//sum이라는 변수를 사용하여 누적 합을 표현
//i라는 변수를 사용하여 카운트를 수행
//while문, for문 2가지 버전의 정답

public class WhileEx3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int max = 3;

		while (i <= max) {
			sum += i;
			i++;
		}
		System.out.println(sum);

//		int max = 3;
//		int sum = 0;
//
//		for (int i = 1; i <= max; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
	}
}
