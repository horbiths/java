package loop;

//1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?

public class Break2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		for (; ; ) { //조건식이 없으면 무한 반복한다.
			sum += i;
			if (sum > 10) {
				System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum);
				break; //for문을 빠져나간다.
			}
			i++;
		}
	}
}
