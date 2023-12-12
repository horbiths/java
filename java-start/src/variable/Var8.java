package variable;

//변수의 숫자 타입
public class Var8 {

	public static void main(String[] args) {
		//정수
		byte b = 127; // -128 ~ 127 까지 저장
		short s = 32767; // -32,768 ~ 32,767 까지 저장
		int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억) 까지 저장
		
		long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 까지 저장
		// 뒤에 대문자 L을 붙여줘야 한다. 소문자도 상관없지만 숫자 1과 착각할 수 있어서 대문자를 추천한다.

		//실수
		float f = 10.0f; // 뒤에 소문자 f를 붙여준다.
		double d = 10.0;

		//저장 공간이 클수록 메모리를 많이 잡아먹는다.
		//그래서 필요에 맞도록 다양한 타입을 제공한다.

		/*
		정수 리터럴은 int를 기본형으로 사용한다. 따라서 int 범위까지 표현할 수 있다.
		숫자가 int 범위인 약 20억을 넘어가면 L을 붙여서 정수 리터럴을 long으로 변경해야 한다.
		실수 리터럴은 기본이 double형을 사용한다. float형을 사용하려면 f를 붙여서 float형으로 지정해야 한다.
		*/
	}
}