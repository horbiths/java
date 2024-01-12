## If문 VS Switch문

switch문의 조건식을 넣는 부분을 잘 보면 x > 10과 같은 참 거짓의 결과가 나오는 조건이 아니라, 단순히 값만 넣을 수 있다.

switch문은 조건식이 특정 case와 같은지만 체크할 수 있다. 쉽게 이야기해서 값이 같은지 확인하는 연산만 가능하다. (문자도 가능)

반면에 if문은 참 거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있다. 

예) x > 10, x == 10

## 자바 14 새로운 swtich문

switch문은 if문 보다 조금 덜 복잡한 것 같지만, 그래도 코드가 기대보다 깔끔하게 나오지 않는다.

이런 문제를 해결하고자 자바 14부터는 새로운 switch문이 정식 도입되었다.

기존 코드를 새로운 switch문으로 개발하면 다음과 같다.

```
package cond;

public class Switch4 {

	public static void main(String[] args) {
		// 1 = 1000 2= 2000 3 = 3000 나머지 : 500
		int grade = 2;
		
		int coupon = switch (grade) {
			case 1 -> 1000;
			case 2 -> 2000;
			case 3 -> 3000;
			default -> 500;
		};
		System.out.println("발급받은 쿠폰 " + coupon);
	}
}
```

기존 swtich문과 차이

- ->를 사용
- 선택된 데이터를 반환