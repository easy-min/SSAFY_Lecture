package Day03분할정복;

public class 퀵정렬02_로무토파티션 {
	static int[] arr = { 7, 5, 6, 8, 1, 2, 3, 39 };
	static int N = arr.length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void quickSort(int start, int end) {
		if (start < end) {
			int pivot = partition(start, end);
			quickSort(start, pivot-1);
			quickSort(pivot+1, end);
		}
	}
	private static int partition(int start, int end) {
		int pivot = arr[start]; // 첫번째 요소를 피봇이라고 결정
		int i = start -1; // 작은 값들의 경계
		for (int j = start; j < end; j++) {
			if(arr[j] <= pivot) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}// 경계가 결정이 되어 있다!
		int tmp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = arr[i+1];
		return i +1;
	}

}
