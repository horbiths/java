package scanner;

/*
System.in을 통해서 사용자의 입력을 받을 수 있다.
그런데 자바가 제공하는 System.in을 통해서 사용자 입력을 받으려면 여러 과정을 거쳐야해서 복잡하고 어렵다.
자바는 이런 문제를 해결하기 위해 Scanner라는 클래스를 제공한다. 이클래스를 사용하면 사용자 입력을 매우 편리하게 받을 수 있다.
 */

import java.util.Scanner; //자바 라이브러리의 Scanner를 사용한다.

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //new Scanner라는 것으로 Scanner를 만드는 것
		//이 코드는 객체와 클래스를 배워야 정확히 이해할 수 있어서 지금은 Scanner의 기능을 사용하기 위해 new를 사용해서 Scanner를 만든다 정도로 이해하면 된다.

		System.out.println("hello"); //print("\n") == println()
		System.out.println("world");

		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine(); //입력을 String으로 가져온다.
		System.out.println("입력한 문자열 : " + str);

		System.out.print("정수를 입력하세요 : ");
		int intValue = scanner.nextInt(); //입력을 int로 가져온다.
		System.out.println("입력한 정수 : " + intValue);

		System.out.print("실수를 입력하세요 : ");
		double doubleValue = scanner.nextDouble(); //입력을 double로 가져온다.
		System.out.println("입력한 실수 : " + doubleValue);
	}
}

//주의할 것으로는 타입이 다르면 오류가 발생한다.
