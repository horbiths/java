package array;

//배열의 선언과 생성

public class Array1Ref1 {

	public static void main(String[] args) {
		int [] students; //배열 변수 선언
		students = new int[5]; //배열 생성

		System.out.println(students);

		//변수 값 대입
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		//변수 값 사용
		System.out.println("학생1 점수 : " + students[0]);
		System.out.println("학생2 점수 : " + students[1]);
		System.out.println("학생3 점수 : " + students[2]);
		System.out.println("학생4 점수 : " + students[3]);
		System.out.println("학생5 점수 : " + students[4]);
	}
}

//기본형 vs 참조형
//자바의 변수 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류
//사용하는 값을 직접 넣을 수 잇는 기본형, 그리고 배열 변수와 같이 메모리의 참조값을 넣을 수 있는 참조형으로 분류
//기본형(Primitive Type) : int, long, double, boolean처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입
//참조형(Reference Type) : int[] students와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입