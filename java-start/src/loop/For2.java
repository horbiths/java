package loop;

//i부터 하나씩 증가하는 수를 endNum까지 더해라
public class For2 {

	public static void main(String[] args) {
		int sum = 0;
		int endNum = 3;

		for (int i = 1; i <= endNum; i++) { //int i는 1이고, i가 endNum과 같거나 작을 때 까지 sum += i를 실행하는 것과 출력하는 것을 반복하고, 반복 할 때마다 i를 1증가시킨다.
			sum += i;
			System.out.println("i = " + i + " sum = " + sum);
		}
	}
}
