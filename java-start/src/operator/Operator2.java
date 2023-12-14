package operator;

//문자열 더하기
//자바는 특별하게 문자열에도 + 연산자를 사용할 수 있다. 문자열에 +연산자를 사용하면 두 문자를 연결할 수 있다.
public class Operator2 {

	public static void main(String[] args) {

		//문자열과 문자열 더하기1
		String result1 = "hello " + "world"; //"hello " + "world" = "hello world"
		System.out.println(result1);

		//문자열과 문자열 더하기2
		String s1 = "string1";
		String s2 = "string2";
		String result2 = s1 + s2; //문자열을 그대로 더해서 result2에 담는 것
		System.out.println(result2);

		//문자열과 숫자 더하기1
		String result3 = "a + b = " + 10; //문자열과 숫자를 더하면 숫자를 문자열로 바꾼다.
		//"a + b = "(String) + 10(int)
		//"a + b = "(String) + "10"(int -> String)
		//"a + b = " + "10" = "a + b = 10"
		System.out.println(result3);

		//문자열과 숫자 더하기2
		int num = 20;
		String str = "a + b = ";
		String result4 = str + num;
		System.out.println(result4);
	}
}
