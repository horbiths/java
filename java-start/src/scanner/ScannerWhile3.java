package scanner;

//사용자 입력을 받아 그 합계를 계산하는 프로그램
//사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료
//이 때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력

import java.util.Scanner;

public class ScannerWhile3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;

		while (true) { //중간에 break문을 만나기 전까지 무한 반복
			System.out.print("정수를 입력하세요(0을 입력하면 종료) : ");
			int num = input.nextInt();
			
			if (num == 0) { //사용자가 0을 입력하면 사용자가 입력한 모든 정수의 합을 출력하면서 프로그램 종료
				break;
			}

			sum += num;
		}

		System.out.println("입력한 정수들의 합 : " + sum);
	}
}
