package method;

public class Overloading3 {

	public static void main(String[] args) {
		System.out.println("1 : " + add(1, 2));
		System.out.println("2 : " + add(1.2, 1.5));
	}

	//첫 번재 add 메서드 : 두 정수를 받아서 합을 반환한다.
	//이 메서드를 지워도 두 번째 메서드가 double형이라 int가 자동 형변환이 되면서 적용이 된다.
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}

	//두 번째 add 메서드 : 두 실수를 받아서 합을 반환한다.
	//첫 번재 메서드와 이름은 같지만, 매개변수의 유형이 다르다.
	public static double add(double a, double b) {
		System.out.println("2번 호출");
		return a + b;
	}
}
