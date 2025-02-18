package 정렬;

import java.util.Arrays;

public class Array06_선택정렬 {

	public static void main(String[] args) {
		int[] arr = { 3, 13, 26, 88, 22, 11, 54, 12 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {
		// 반복을 돌 것임!
		for (int i = 0; i < arr.length - 1; i++) {// 마지막은 해도 되고 안 해도 되고
			int minIdx = i; // 우선 이 자리가 가장 작은 것이야 하고 초기화 함
			// 나를 제외하고 정렬된 것도 제외하고 나머지 중 가장 작은 값의 위치 얻겠다
			for (int j = i + 1; j < arr.length; j++) { // j는 끝까지 가야 함
				if (arr[minIdx] > arr[j]) { // arr[minIdx] < arr[j] 한다면 내림차순으로 정렬 가능
					minIdx = j;
				}
			} // 가장 작은 값의 위치를 얻어 냈다 (그게 나 자신일 수도 있음)
			// swap할 것이야
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		} // 내가 정렬하고 싶은 자리를 위한 for문
	}

}
