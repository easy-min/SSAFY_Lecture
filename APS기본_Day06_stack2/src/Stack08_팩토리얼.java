
public class Stack08_팩토리얼 {
	public static void main(String[] args) {
		System.out.println(fact(5));
//		System.out.println(fact(13)); // int형으로 처리할 경우 터짐
	}

	public static int fact(int n) {
		// 기본
		if (n == 0 || n == 1)
			return 1;

		// 재귀 호출
		return n * fact(n - 1);
	}
}
