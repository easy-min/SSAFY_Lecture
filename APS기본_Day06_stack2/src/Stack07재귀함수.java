
public class Stack07재귀함수 {

	public static void main(String[] args) {
//		func1();

	}
	public static void func1() {
		System.out.println("함수1 호출");
		func1();
	}
	public static void func2(int num) {
		// 1. 기본 부분 (재귀를 끝내는 조건)
		if (num < 0 ) return;
		// 2. 재귀 부분
		else {
			System.out.println("func2 호출");
			func2(num-1);
		}
	}

}
