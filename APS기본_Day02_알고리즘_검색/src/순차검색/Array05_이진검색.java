package 순차검색;

public class Array05_이진검색 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 9, 11, 19, 23}; // 정렬 O
		int key = 11;
	System.out.println(BinarySearch(arr, 11));

	}
	public static int BinarySearch(int[] arr, int key) {
		int L = 0;
		int R = arr.length-1;
		while (L<=R) { // 교차가 되면 멈추겠다
			int mid = (L+R)/2; // 버림 처리가 된다!
			// 그렇지만 N이 기하급수적으로 26억 이상 될 경우에는 틀릴 수도 있음
			// int값의 범위를 넘는 경우 10^9 문제가 발생할 수도 있음
			// (0+6)/2 = 3, (0+5)/2 = 2;
			if (arr[mid]==key) return mid;
			else if (arr[mid]<key) L = mid+1;
			else R = mid-1;
		}
		return -1;
	}
	
	public static int BinarySearch2(int[] arr, int left, int right, int key) {
		if (left>right) return -1;
		int mid = (left + right) / 2;
		if (arr[mid]==key) return mid;
		else if (arr[mid]<key) return BinarySearch2(arr, mid+1, right, key);
		else return BinarySearch2(arr, left, mid-1, key);
	}

}
