// package는 지금 단계에서는 자바 파일을 구분하기 위한 폴더로 이해
// package를 만들었으면, 해당 패키지에 들어가는 자바 파일 첫줄에 선언해야 한다.
package variable; // 소속된 package를 선언
//Class를 만들때 첫 글자를 관례상 대문자로한다.
public class Var1 { // Var1 class의 범위 시작
	public static void main(String[] args) { // 단축어 : psvm, main() 메서더의 범위 시작
		System.out.println(10); // 단축어 : sout, 10을 출력
		System.out.println(10);
		System.out.println(10);
	}
}
