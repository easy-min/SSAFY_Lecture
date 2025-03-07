package Day03분할정복;

public class 거듭제곰01_반복문 {

	public static void main(String[] args) {

	}
	
	// C: 숫자
	// N: 지수
	static int pow(int C, int N) {
		int result = 1; // C^0 = 1이 나와야 하니 (음수승은 구할 수 없다)
		for (int i = 1; i<=N; i++) {
			result *=C;
		}
		return result;
	}
	static int pow2(int C, int N) {
		if (N==1) return C;
		return C*pow2(C, N-1);
	}
}
