package operator;

//논리연산자
//boolean형인 true, false를 비교하는데 사용한다.
public class Logical1 {

	public static void main(String[] args) {
		System.out.println("&& : AND 연산"); //두 피연산자가 모두 참이면 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && false); //false

		System.out.println("|| : OR 연산"); //두 피연산자중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
		System.out.println(true || true); //true
		System.out.println(false || false); //false
		System.out.println(false || false); //false

		System.out.println("! : NOT 연산"); //피연산자의 논리적 부정을 반환. 즉, 참이면 거짓을, 거짓이면 참을 반환
		System.out.println(!true); //false
		System.out.println(!false); //true

		System.out.println("변수 활용");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);
	}
}
