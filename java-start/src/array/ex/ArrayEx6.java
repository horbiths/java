package array.ex;

//가장 작은 수, 큰 수 찾기
//사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
		int n = scanner.nextInt();

		int [] numbers = new int[n];
		int min = 0;
		int max = 0;

		System.out.println(n + "개의 정수를 입력하세요 : ");
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		min = numbers[0];
		max = numbers[0];
		for (int i = 0; i < n; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		System.out.println("가장 작은 정수 : " + min);
		System.out.println("가장 큰 정수 : " + max);
	}
}
