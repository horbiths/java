package array.ex;

//합계와 평균2
//ArrayEx4에서 입력받을 숫자의 개수를 입력받도록 개선

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
		int inputCount = scanner.nextInt();
		int [] numbers = new int[inputCount];
		int sum = 0;


		System.out.println(inputCount + "개의 정수를 입력하세요 : ");
		for (int i = 0; i < inputCount; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		double average = (double) sum / inputCount;

		System.out.println("입력한 정수의 합계 : " + sum);
		System.out.println("입력한 정수의 평균 : " + average);

	}
}

