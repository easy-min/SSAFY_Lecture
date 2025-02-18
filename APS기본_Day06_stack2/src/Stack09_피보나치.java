import java.util.Arrays;

public class Stack09_피보나치 {
	static int[] count = new int[100];
	public static void main(String[] args) {
		System.out.println(mfibo(10));
		System.out.println(Arrays.toString(memo));
	}
	// 나는 나의 이전과 이이전을 더해서 만듭니다.
	public static int fibo(int n) {
		count[n]++;
//		if (n==0) return 0;
//		if (n==1) return 1;
		if (n<2) return n; // n이 음수가 안된다는 조건이 문제에 있어야 함
		return fibo(n-1)+fibo(n-2);
		
		
	}
	static int[] memo = new int[50];
	static {
		Arrays.fill(memo, -1);
		memo[0] = 0;
		memo[1] = 1;
	}
	public static int mfibo(int n) {
		if(memo[n]==-1) {
			memo[n] = mfibo(n-1)+mfibo(n-2);
		}
//		if (n>=2 && memo[n] == 0) {
//			memo[n] = mfibo(n-1)+mfibo(n-2);
//		}
		return memo[n];
	}
}
