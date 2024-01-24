package scanner;

//사용자가 입력한 문자열을 그대로 출력하는 예제
//exit라는 문자가 입력되면 프로그램을 종료
//프로그램은 반복해서 실행

import java.util.Scanner;

public class ScannerWhile1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) { //중간에 break문을 만나기 전까지 무한 반복
			System.out.print("문자열을 입력하세요(exit : 종료) : ");
			String str = scanner.nextLine();
			if (str.equals("exit")) { //입력받은 문자가 "exit"이면 "프로그램을 종료합니다."를 출력하고 break문을 통해서 while문을 빠져나간다.
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("입력한 문자열 : " + str);
		}

	}
}
