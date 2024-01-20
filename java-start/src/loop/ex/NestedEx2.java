package loop.ex;

//int rows를 선언
//이 수만큼 다음과 같은 피라미드를 출력
//rows = 2
//*
//**

//참고 : println()은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print()를 사용
//예) System.out.print("*")

public class NestedEx2 {

	public static void main(String[] args) {
		int rows = 5;

		for (int i =1; i <= rows; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
