package cond;

public class CondOp2 {

	public static void main(String[] args) {
		int age = 18;
		String status = (age >= 18) ? "성인" : "미성년자";
		//조건 ? 참 표현식 : 거짓 표현식
		//조건에 만족하면 참 표현식이 실행되고, 조건에 만족하지 않으면 거짓 표현식이 실행된다.
		//if문 처럼 코드 블럭을 넣을 수 있는 것이 아니라 단순한 표현식만 넣을 수 있다.
		System.out.println("age = " + age + " status = " + status);
	}
}
