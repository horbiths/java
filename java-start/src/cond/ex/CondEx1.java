package cond.ex;

//문제와 풀이1
//학점 계산하기
//학생의 점수를 기반으로 학점을 출력하는 프로그램을 작성
//90점 이상 : "A"
//80점 이상 90점 미만 : "B"
//70점 이상 80점 미만 : "C"
//60점 이상 70점 미만 : "D"
//60점 미만 : "F"
//점수는 int score로 지정, 해당 변수를 기반으로 학점을 출력
//출력 예시
//score: 95
//출력: 학점은 A입니다.
public class CondEx1 {

	public static void main(String[] args) {

		int score = 80;

		String grade;
		if (score >= 90) {
			System.out.println("학점은 A입니다.");
		} else if (score >= 80) {
			System.out.println("학점은 B입니다.");
		} else if (score >= 70) {
			System.out.println("학점은 C입니다.");
		} else if (score >= 60) {
			System.out.println("학점은 D입니다.");
		} else {
			System.out.println("학점은 F입니다.");
		}
	}
}
