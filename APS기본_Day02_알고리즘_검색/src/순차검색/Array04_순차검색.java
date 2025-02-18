package 순차검색;

import java.util.Arrays;

public class Array04_순차검색 {

	public static void main(String[] args) {
		int[] arr = {4, 9, 11, 23, 2, 19, 7}; // 정렬 X
		int N = arr.length;
		int key = 2; // 원래는 스캐너를 통해서 입력 받음
		System.out.println(serachwhileNoSort(arr, 2, 7));
		Arrays.sort(arr);
		
		

	}
	static int serachwhileNoSort(int[] arr, int key, int N) {
		int i = 0;
		while (i <N && arr[i] != key) {
			i++;
		}
		if (i<N) return i;
		return -1;
	}
	
	static int serachwhileNoSort2(int[] arr, int key){
		int i = 0;
		while (i<arr.length) {
			if (arr[i]==key) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	static int searchWhileSort(int[] arr, int key) {
		int i =0;
		while (arr[i] <= key && i<arr.length) {
			if (arr[i] == key) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	static int searchForSort(int[] arr, int key) {
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == key)	return i;
			else if (arr[i] > key) break;
		}
		return -1;
	}
}
