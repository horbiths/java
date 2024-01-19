package loop;

//1부터 하나씩 증가하는 수를 3번 더하기
//while문을 사용하지 않은 버전
public class While2_1 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		count++; //count(1)
		sum += count; //sum(0) + count(1) -> sum(1)
		count++;  //count(2)
		sum += count; //sum(1) + count(2) -> sum(3)
		count++; //count(3)
		sum += count; //sum(3) + count(3) -> sum(6)

		System.out.println("sum : " + sum);
	}
}
