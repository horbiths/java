package variable;

public class Var3 {
	public static void main(String[] args) {
		int a; //변수 선언
		a = 10; //변수 초기화 a(10) //1. 변수 a에 10을 저장
		System.out.println(a); // 순차적으로 흘러가서 처음엔 10이 출력되고 //2. 변수 a의 값을 읽으니 10이 들어있어서 10을 출력한다.
		a = 50; //변수 값 변경 : a(10 -> 50) //3. 변수 a의 값을 50으로 변경한다.(10 -> 50)
		System.out.println(a); // 다음에는 50이 출력된다. //4. 변수 a의 값을 읽으니 50이 들어있어서 50을 출력한다.
		//변수의 값을 변경하면 변수에 들어있던 기존 값은 삭제된다.
	}
}
