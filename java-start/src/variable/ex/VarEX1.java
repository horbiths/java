package variable.ex; //variable안에 package라서 .을 넣어준다.

//문제와 풀이

public class VarEX1 {

	public static void main(String[] args) {
		//문제 1번
		//다음 코드에 반복해서 나오는 숫자 4, 3을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 num1, num2를 사용하도록 변경해 보세요.
//		System.out.println(4 + 3);
//		System.out.println(4 - 3);
//		System.out.println(4 * 3);

		//나의 풀이
		int num1 = 4; //변수의 타입을 int로 이름을 num1으로 선언하고 4를 저장한다.
		int num2 = 3; //변수의 타입을 int로 이름을 num2으로 선언하고 3을 저장한다.

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);

		//풀이와 정답이 같다.
	}
}
