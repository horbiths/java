package loop;

// i부터 하나씩 증가하는 수를 endNum까지 더하라

public class While2_3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int endNum = 3;

		while (endNum >= i) {
			sum += i;
			System.out.println("i = " + i + " sum = " + sum);
			i++;
		}
	}
}
