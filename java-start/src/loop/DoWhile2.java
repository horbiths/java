package loop;

public class DoWhile2 {

	public static void main(String[] args) {
		int i = 10;

		do {
			System.out.println("현재 숫자는 : " + i);
			i++;
		}	while (i < 3);
	} //i < 3이 거짓이어도 최초 한 번은 출력을 함
}
