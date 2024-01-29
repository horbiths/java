package scanner.ex;

//이름과 나이 반복
//사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램
//사용자가 "종료"를 입력하면 프로그램이 종료

import java.util.Scanner;

public class ScannerWhileEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
			String name = scanner.nextLine();

			if (name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("나이를 입력하세요 : ");
			int age = scanner.nextInt(); // 우리가 입력하면 10\n가 입력되는데 nextInt는 여기서 10만 가져가서 \n이 남아서 그다음 nextLine에서 \n을 입력값으로 인식한다.
			scanner.nextLine(); //\n을 한 번 읽어줘서 \n을 없앤다.


			System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
		}

	}
}
