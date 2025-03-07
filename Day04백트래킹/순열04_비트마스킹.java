package Day04백트래킹;

import java.util.Arrays;

public class 순열04_비트마스킹 {
	static int[] nums;
	static int N;
	static int[] result;// 결과 배열
	public static void main(String[] args) {
		nums = new int[] {0, 1, 2}; // 추가적인 메모리 공간이 필요 없다
		N = nums.length;
		result = new int[N];
		perm(0,0);
	}
	// idx는 내가 채울 위치
	// 사전순으로 동작함 (인덱스로 동작하기로 했으니깐)
	static void perm(int idx, int visited) {
		// 기저 조건
//		if (visited == (1<<N)-1) 이렇게 써도 돼
		if(idx==N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// 재귀 부분
		for (int j = 0; j<N; j++) { // 0이라는 게 중요하다
			//너썼니를 어떻게 판별할 수 있을까?
			//사용했니? (=j번째 재료가 있니?)
			if((visited & (1<<j))!=0){ // 0은 재료를 안 썼다 1은ㄴ 재료를 썼다
				continue;
			}
			result[idx] = nums[j];
			perm(idx+1, visited | (1<<j));
			//원상복구
			

		}
	}


}
