package array;

//향상된 for문
//각각의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부른다.
/*
for (변수 : 배열 또는 컬렉션) {
	//배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
}
 */


public class EnhancedFor1 {

	public static void main(String[] args) {
		//2x3 2차원 배열, 초기화
		int[] numbers = {1, 2, 3, 4, 5};

		//일반 for문
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.println(number);
		}

		//향상된 for문, for-each문
		for (int number : numbers) { //단축어 iter
			System.out.println(number);
		}

		//for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요할때
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
		}
	}
}
