package loop.ex;

//구구단 출력
//중첩 for문을 사용해서 구구단을 완성

public class NestedEX1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
