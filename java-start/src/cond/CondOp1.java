package cond;

//삼항 연산자
public class CondOp1 {

	public static void main(String[] args) {
	//if문을 사용할 때 다음과 같이 단순히 참과 거짓에 따라 특정 값을 구하는 경우가 있다.
		int age = 18;
		String status;
		if (age >= 18) {
			status = "성인";
		} else {
			status = "미성년자";
		}
		System.out.println("age = " + age + " status = " + status);
	}
	// 이렇게 단순히 참과 거짓에 따라서 특정 값을 구하는 경우 삼항 연산자 또는 조건 연산자라고 불리는 ?: 연산자를 사용할 수 있다.
}
