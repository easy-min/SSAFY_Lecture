import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class String01_생성 {

	public static void main(String[] args) {
		// 1. 리터럴 사용 -> String pool
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2); // 참조 자료형에서는 주소값을 비교한다 (str 둘은 같아요)

		// 2. heap의 생성
		String str3 = new String("Hello");
		// str1 != str3
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3)); // object에서 가지고 있는데 우리가 재정의해서 사용하기도 함

		byte[] bytes = { 65, 66, 67 };
		String str4 = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(str4);

		// 문자열은 불변성을 가지고 있다!!!!!!!
		// 문자열에서 문자를 하나씩 뜯어오고 싶다
		// 문자열을 char[] 형태로 만들려면
		char[] arr1 = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i) + " "); // charAt은 인덱스를 넣게 되어 있음
			arr1[i] = str1.charAt(i);
		}
		System.out.println(Arrays.toString(arr1));

		// 조금 더 편하게 만들 수 없나
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2));

		// 자바에서 문자 한 개를 입력받는 방법은 없어용
		// 문자열로 받아서 charAt(0) 해야 함 ㅎ.ㅎ
		// sc.next().charAt(0) 이런 식으로 문자 한 개 씩 받을 수 있다

		// contains는 문자열 안에 해당 인자를 포함하고 있는지 쳌
		System.out.println(str1.concat("ll"));
		System.out.println(str1.contains("el"));
		// split은 구분자를 이용하여 문자열을 구분하는 역할
		String[] numbers = "one, two, three".split(",");
		System.out.println(Arrays.toString(numbers));
	}

}
