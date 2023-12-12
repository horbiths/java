package variable;

//변수 타입
//변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재한다. 이러한 형식을 type이라고 하고,
//우리말로는 형식 또는 형이라 한다.
//변수를 선언하면 각 타입에 따라 정해진 메모리에 값들을 저장할 수 있다.
//각 변수는 지정한 타입에 맞는 값을 사용해야 한다.
public class Var7 {
	public static void main(String[] args) {
		int a = 100; //정수
		double b = 10.5; //실수
		boolean c = true; //불리언 true, false 입력 가능
		char d = 'A'; //문자 하나
		String e = "Hello Java"; //문자열, 문자열을 다루기 위한 특별한 타입

		System.out.println(a); //인텔리제이 단축키 Ctrl+D로 아래로 복사할 수 있다.
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		//코드에서 개발자가 직접 적은 100, 10.5, true, 'A', "Hello Java"와 같은 고정된 값을
		//프로그래밍 용어로 리터럴(Literal)이라 한다.
		//리터럴이라는 단어의 어원이 문자 또는 글자를 의미한다.
	}
}
