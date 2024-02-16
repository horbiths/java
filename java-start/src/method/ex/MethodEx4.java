package method.ex;

//은행 계좌 입출금

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
		int balance = 0;
		int option;

		while(true) {
			printMenu();
			System.out.print("선택 : ");
			option = scanner();

			if (option == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			balance = option(option, balance);

/*
강의 풀이
			switch (option) {
				case 1:
					balance = deposit(balance);
					break;
				case 2:
					balance = withdraw(balance);
					break;
				case 3:
					System.out.println("현재 잔액 : " + balance + "원");
					break;
				case 4:
					System.out.println("시스템을 종료합니다.");
					return;
				default:
					System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
			}
			*/
		}
	}

	public static void printMenu() {
		System.out.println("---------------------------------------");
		System.out.println("1.입금 | 2.출금 | 3. 잔액 확인 | 4.종료");
		System.out.println("---------------------------------------");
	}

	public static int scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static int option(int option, int balance) {
		if (option == 1) {
			return deposit(balance);
		} else if (option == 2) {
			return withdraw(balance);
		} else if (option == 3) {
			return balance(balance);
		} else {
			System.out.println("옳바른 숫자를 입력하세요.");
			return balance;
		}
	}

	public static int deposit(int balance) {
		System.out.print("입금액을 입력하세요 : ");
		int depositAmount = scanner();

		balance += depositAmount;
		System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
		return balance;
	}

	public static int withdraw(int balance) {
		System.out.print("출금액을 입력하세요 : ");
		int withdrawAmount = scanner();

		if (balance >= withdrawAmount) {
			balance -= withdrawAmount;
			System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
		} else {
			System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
		}
		return balance;
	}
	
	public static int balance(int balance) {
		System.out.println("현재 잔액 : " + balance + "원");
		return balance;
	}
}
