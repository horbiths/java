package variable;

public class Var2 {
	public static void main(String[] args) {
		// 변수는 이름 그대로 변하는 수
		int a; // 변수 선언, int = integer
		a = 20; // 변수 초기화, 변수의 내용을 바꾸면 출력되는 내용도 바뀐다. 10 -> 20
		// = 기호는 equals이 아닌 오른쪽의 값을 왼쪽에 저장한다는 뜻이다.
		// 선언한 변수에 처음으로 값을 대입해서 저장하는 것을 변수 초기화라고 한다.

		System.out.println(a); // 변수 a의 값을 읽고 a의 값으로 변경 후에 출력한다.
		/* 다음과 같이 해석할 수 있다.
		System.out.println(a); 변수 a의 값을 읽음
		System.out.println(10); a의 값인 10으로 변경 후 출력
		*/
		System.out.println(a);
		System.out.println(a);
	}
}
