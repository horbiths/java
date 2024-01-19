package loop;

//do-while문은 while문과 비슷하지만, 조건에 상관없이 무조건 한 번을 코드를 실행
//do {
	//코드
//} while (조건식);

public class DoWhile1 {

	public static void main(String[] args) {
		int i = 10;
		while (i < 3) {
			System.out.println("현재 숫자는 : " + i);
			i++;
		} // i < 3 조건식은 거짓이라 아무것도 출력 안됨
	}
}
