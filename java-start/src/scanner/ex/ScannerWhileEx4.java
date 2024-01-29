package scanner.ex;

//상품 구매
//사용자로부터 상품 정보 (상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램
//사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있다.
//사용자에게 다음 세 가지 옵션을 제공
//1. 상품입령, 2. 결제, 3. 프로그램 종료
//옵션은 정수로 입력받으면, 옵션을 저장하는 변수의 이름은 option
//상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
//결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0으로 초기화 (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정한다. 따라서 다음 사용자를 위해 총 비용을 다시 0으로 초기화)
//프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료
//위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력

import java.util.Scanner;

public class ScannerWhileEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalPrice = 0;

		while (true) {
			System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
			int option = scanner.nextInt();
			scanner.nextLine();

			if (option == 1) {
				System.out.print("상품명을 입력하세요 : ");
				String name = scanner.nextLine();

				System.out.print("상품의 가격을 입력하세요 : ");
				int price = scanner.nextInt();

				System.out.print("구매 수량을 입력하세요 : ");
				int quantity = scanner.nextInt();

				int sum = price * quantity;

				System.out.println("상품명 : " + name + " 가격 : " + price + " 합계 : " + sum);

				totalPrice += sum;
			} else if (option == 2) {
				System.out.println("총 비용 : " + totalPrice);
				totalPrice = 0; //결제 후 총 비용 초기환
			} else if (option == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 옵션을 선택해주세요.");
			}
		}
	}
}
