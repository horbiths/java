package scanner;

//첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램
//첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료
//프로그램은 반복해서 실행

import java.util.Scanner;

public class ScannerWhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
		while (true) { //중간에 break문을 만나기 전까지 무한 반복
			System.out.print("첫 번째 숫자를 입력하세요 : ");
			int num1 = scanner.nextInt();

			System.out.print("두 번째 숫자를 입력하세요 : ");
			int num2 = scanner.nextInt();
			
			if (num1 == 0 && num2 == 0) { //두 숫자 모두 0을 입력하면 "프로그램을 종료합니다."를 출력하고 break문을 통해서 while문을 빠져나간다.
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			int sum = num1 + num2;
			System.out.println("입력한 두 수의 합 : " + sum);
		}

	}
}
