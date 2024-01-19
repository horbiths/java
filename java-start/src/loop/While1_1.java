package loop;

// 반복문은 이름 그대로 특정 코드를 반복해서 실행할 때 사용
//자바는 while, do-while, for 3 가지 종류의 반복문을 제공

public class While1_1 {

	public static void main(String[] args) {
		int count = 0;

		count = count +1; // count++; 로 해도 된다.
		System.out.println("현재 숫자는 : " + count);
		count = count +1;
		System.out.println("현재 숫자는 : " + count);
		count = count +1;
		System.out.println("현재 숫자는 : " + count);
	}

	//같은 코드가 3번 반복되고 있음
	//1을 한 번씩 더해서 총 100번 더하는 코드가 되면 같은 코드가 100번 반복됨
	//이렇게 특정 코드를 반복해서 실행할 때 사용하는 것이 반복문
}
