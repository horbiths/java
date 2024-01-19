package loop;

//continue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용

/*
while(조건식) {
	코드1;
	continue; 즉시 조건식으로 이동
	코드2;
} continue를 만나면 코드2가 실행되지 않고 다시 조건식으로 이동
조건식이 참이면 while문을 실행
 */
public class Continue1 {

	public static void main(String[] args) {
		int i = 1;

		//i=1,2,3,4
		while (i <= 5) {
			if (i == 3) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
