package loop;

//while문을 사용해서 1을 한 번씩 더해서 총 3번 더하는 코드
//while (조건식) {
//	코드
//}
//조건식이 true면 계속 반복

public class While1_2 {

	public static void main(String[] args) {
		int count = 0;

		while(count < 3) {
			count++;
			System.out.println("현재 숫자는 : " + count);
		}
	}
}
