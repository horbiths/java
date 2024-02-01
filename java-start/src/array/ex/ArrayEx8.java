package array.ex;

//2차원 배열2
//ArrayEx7에서 학생수를 입력받도록 개선

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학생수를 입력하세요 : ");
		int studentNumber = scanner.nextInt();

		int [][] score = new int[studentNumber][3];
		String [] sub = {"국어", "영어", "수학"};

		for (int i = 0; i < studentNumber; i++) {
			System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
			for (int j = 0; j < 3; j++) {
				System.out.print(sub[j] + " 점수 : ");
				score [i][j] = scanner.nextInt();

			}
		}

		for (int i = 0; i < studentNumber; i++) {
			int total = 0;
			for (int j = 0; j < 3; j++) {
				total += score [i][j];
			}
			double average = total / 3.0;
			System.out.println((i + 1) + "번 학생의 총점 : " + total + ", " + "평균 : " + average);
		}
	}
}
