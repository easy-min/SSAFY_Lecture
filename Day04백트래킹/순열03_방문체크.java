package Day04백트래킹;

import java.util.Arrays;

public class 순열03_방문체크 {
	static int[] nums;
	static int N;
	static int[] result;// 결과 배열
	static boolean[] visited; //방문 쳌
	public static void main(String[] args) {
		nums = new int[] {0, 1, 2}; // 추가적인 메모리 공간이 필요 없다
		N = nums.length;
		result = new int[N];
		visited = new boolean[N];
		perm(0);
	}
	// idx는 내가 채울 위치
	// 사전순으로 동작함 (인덱스로 동작하기로 했으니깐)
	static void perm(int idx) {
		// 기저 조건
		if(idx==N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// 재귀 부분
		for (int i = 0; i<N; i++) { // 0이라는 게 중요하다
			//사용하지 않은 원소를 사용해야 해
			//1. 사용했으면 쳐내
			if(visited[i]) continue;
			result[idx] = nums[i];
			visited[i] = true; // 사용했어
			perm(idx+1);
//			result[idx] = 0; // 불필요함 (다음 반복문 돌면서 덮어씌워짐)
			visited[i] = false; // 원상복구
			
			
			
//			//2. 사용하지 않았으면 해
//			if(!visited[i]) {
//				
//			}

		}
	}


}
