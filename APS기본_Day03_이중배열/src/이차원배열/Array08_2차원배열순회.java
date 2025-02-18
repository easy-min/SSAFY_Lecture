package 이차원배열;

public class Array08_2차원배열순회 {
	public static void main(String[] args) {
		// 문제를 풀 때는 입력을 통해서 채운다.
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		normal(arr);
		reverse(arr);
		reverse2(arr);
		열우선순회(arr);
		지그재그순회(arr);
		지그재그순회2(arr);
	}
	public static void normal(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[0].length; j++) { // 지금 문제에서는 arr[0].length 필요 없음
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("-------------------");
	}
	public static void reverse(int[][] arr) { // 인덱스 건들이기
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][arr[i].length-1-j]+" ");
			}
			System.out.println("");
		}
		System.out.println("-------------------");
	}
	public static void reverse2(int[][] arr) { // 조건 건들이기
		for(int i = 0; i<arr.length; i++) {
			for (int j = arr[0].length-1; j>=0; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("-------------------");
	}
	public static void 열우선순회(int[][] arr) {
		for (int j = 0; j<arr[0].length; j++) {
			for (int i = 0; i< arr.length; i++) {
				System.out.print(arr[i][j]+" ");
			} // 행을 위한
			System.out.println();
		}// 열 고정
		System.out.println("-------------------");
	}
	public static void 지그재그순회(int[][] arr) {
		for (int i = 0; i<arr.length; i++) {
			if (i%2==0) {
				for (int j = 0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
			} else {
				for (int j = 0; j<arr[0].length; j++) {
					System.out.print(arr[i][arr[0].length-1-j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
	public static void 지그재그순회2(int[][] arr) {
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[0].length; j++) {
				System.out.print(arr[i][j + (arr[0].length-1-2*j)*(i%2)]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
}
