package loop;

//break는 반복문을 즉시 종료하고 나감
/*
while (조건식) {
	코드1;
	break; 즉시 while문 종료로 이동
	코드2;
} while문 종료
break를 만나면 코드2가 실행되지 않고 while문이 종료
 */

public class Break1 {

	public static void main(String[] args) {
		//1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
		//1 + 2 + 3 ...계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.

		int sum = 0;
		int i = 0;

		while (true) { //조건이 항상 true이기 때문에 무한 반복된다.
			sum += i; //sum = 1+2+3+4+5
			if (sum > 10) {
				System.out.println("힘이 10보다 크면 종료 : i = " + i + " sum = " + sum);
				break; //중간에 빠져나온다.
			}
			i++;
		}
	}
}
