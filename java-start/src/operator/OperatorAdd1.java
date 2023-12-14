package operator;

//증감 연산자
//증가 및 감소 연산자를 줄여서 부르는 말
//++와 --로 표현되며, 이들은 변수의 값을 1만큼 증가시키거나 감소시킨다.
public class OperatorAdd1 {

	public static void main(String[] args) {
		int a = 0;

		a = a + 1;
		System.out.println("a = " + a); //1

		a = a + 1;
		System.out.println("a = " + a); //2

		//증감 연산자
		++a; //a = a + 1
		System.out.println("a = " + a); //3
		--a; //a = a - 1
		System.out.println("a = " + a); //2

		//변수 a의 값을 하나 증가하려면 a = a + 1 연산을 수행해야 한다. 자기 자신에 1을 더하고 그 결과를 자신에게
		//다시 저장해야 한다.
		// a = 0
		// a = a + 1
		// a = 0 + 1 변수 a의 값을 확인(0)
		// a = 1

		// a = a + 1을 ++a로 간단히 표현할 수 있는 것이 증감 연산자이다.
		// ++(증가), --(감소)
	}
}
