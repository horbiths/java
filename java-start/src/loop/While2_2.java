package loop;

// i부터 하나씩 증가하는 수를 3번 더하라

public class While2_2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		sum += i; //sum(0) + i(1) -> sum(1)
		i++; //i(2)

		sum += i; //sum(1) + i(2) -> sum(3)
		i++; //i(3)

		sum += i; //sum(3) + i(3) -> sum(6)

		System.out.println("sum : " + sum);
	}
}
