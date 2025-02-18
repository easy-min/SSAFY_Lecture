
public class Array01_배열의순회 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6};
		int N = arr.length;
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[N-1-i]);
		}
		
		//특정한 인덱스를 기준으로 양쪽으로 퍼지는 순회를 할 수 있는가
		
	}
}
