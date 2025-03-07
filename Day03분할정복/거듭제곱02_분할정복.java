package Day03분할정복;

public class 거듭제곱02_분할정복 {

	public static void main(String[] args) {
		System.out.println(pow(2,10));
		

	}
	static int pow(int C, int N) {
		// 기저 조건
		if (N==0) return 1;
		// 재귀 부분 (1 홀수일 때 / 2 짝수일 때)
		if (N%2==1) {
			int tmp = pow(C, (N-1)/2);
			return tmp*tmp*C;
		} else {
			int tmp = pow(C, (N)/2);
			return tmp*tmp;
		}
	}

}
