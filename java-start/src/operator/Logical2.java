package operator;

//논리 연산자 활용
public class Logical2 {

	public static void main(String[] args) {
		int a = 15;
		//a는 10보다 크고 20보다 작다
		//boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
		boolean result = 10 < a && a < 20; //이렇게 하면 조금 더 읽기가 좋다.
		System.out.println("result = " + result);

	}
}
