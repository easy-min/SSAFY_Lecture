package Day04백트래킹;

import java.util.Arrays;
//[0, 1, 2]
//[0, 2, 1]
//[1, 0, 2]
//[1, 2, 0]
//[2, 1, 0] : 원래는 201이 먼저 나와야 하지만 "사전순"으로 나오지는 않는다"
//[2, 0, 1]
public class 순열02_swap {
	static int[] nums;
	static int N;
	public static void main(String[] args) {
		nums = new int[] {0, 1, 2}; // 추가적인 메모리 공간이 필요 없다
		N = nums.length;
		perm(0);
	}
	// idx는 현재 판단 위치
	static void perm(int idx) {
		// 기저 조건
		if(idx==N) {
			System.out.println(Arrays.toString(nums));
			return;
		}
		// 재귀 부분
		for (int i = idx; i<N; i++) {
			swap(i, idx);
			perm(idx+1);
			swap(i, idx); // 원상복구
		}
	}
	// 바꾸고 싶은 배열은 static하게 선언
	static void swap(int idxa, int idxb) {
		int tmp = nums[idxa];
		nums[idxa] = nums[idxb];
		nums[idxb] = tmp;
	}

}
