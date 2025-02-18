package 정렬;

import java.util.Arrays;

public class Array07_카운팅정렬 {

	public static void main(String[] args) {
		int[] arr = {3, 13, 26, 88, 22, 11, 54, 12};
		countingSort(arr);

	}
	static void countingSort(int[] arr) {
		// 1. 가장 큰 값을 찾는다. (문제에 따라 음수가 나오는 경우 작은 값도 찾아야 함)
		// 만약 점수가 70점 부터 100점 사이라면 그것에 따라서도 범위를 조정할 수 있음
		
		int k = -1; // 작은 값으로 초기화
		for (int i =0; i<arr.length; i++) {
			if (arr[i]>k) k = arr[i];
		}
		// 2. count 하기!
		int[] count = new int[k+1]; // 우리는 K까지 활용을 해야 하니깐
		for (int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		// 3. 누적합 구하기 (해당 원소가 어디 위치에 있어야 하는지를 결정!)
		for (int i=1; i<count.length; i++) {
			count[i] += count[i-1]; // 이전의 값을 이용해서 누적함
			// count[i] = count[i] + count[i-1];
		}
		// 4. 역방향으로 순회하면서.. (안정 정렬)
		int[] sortArr = new int[arr.length];
		for (int i=arr.length-1; i>=0; i--) {
//			int num = arr[i];
//			int idx = count[num]-1;
//			sortArr[idx] = num;
//			count[num]--;
			sortArr[--count[arr[i]]] = arr[i];
		}
		System.out.println(Arrays.toString(sortArr));
	}

}
