package Day03분할정복;

import java.util.Arrays;

public class 병합정렬01 {
	static int[] arr = { 7, 5, 6, 8, 1, 2, 3, 39 };
	static int N = arr.length;
	// 임시 공간이 필요
	static int[] tmp = new int[N];

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		mergeSort(0, N-1);
		System.out.println(Arrays.toString(arr));
	}

	/// 시작 위치와 끝 위치를 보낼꺼에용
	static void mergeSort(int start, int end) {
		if (start >= end)
			return; // 이렇게 써도 okok
		if (start < end) { // start <= end라는 것은 값이 하나짜리 일 때니깐 또 할 필요 X
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			// 병합하는 메서드 호출
			merge(start, mid, end);
		}
	}

	static void merge(int start, int mid, int end) {
		// 정렬하고자 하는 배열들의 시작 위치를 초기화
		int L = start;
		int R = mid+1;
		int idx = start; // 임시 공간의 인덱스
		while(L<=mid && R <= end){
			if (arr[L] <= arr[R]) tmp[idx++] = arr[L++];
			else tmp[idx++] = arr[R++];
		}// 한쪽 구간은 전부 끝
		// 어느 한 쪽 구간은 남아있는 요소가 있음
		if(L <= mid) {
			for(int i = L; i<=mid; i++) {
				tmp[idx++] = arr[i];
		}
		} else {
			for(int i = R; i<=end; i++) {
				tmp[idx++] = arr[i];
			}
		}// 남은 구간 다 털기
		for (int i = start; i<=end; i++) {
			arr[i] = tmp[i];
		}//원본에 덮기
	}
}










