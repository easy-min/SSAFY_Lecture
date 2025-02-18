package 이차원배열;

public class Array10_델타 {
	// static을 통해 델타를 선언을 많이 함
	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int N = arr.length;
		int r = 1;
		int c = 1; // 내가 현재 있는 위치
		for (int d = 0; d < 4; d++) { // 4방향이야!!
			int nr = r + dr[d];
			int nc = c + dc[d]; // 변경된 좌표
			// 2가지 방식
			// 1. 내 안에 들어오면 할래!
//			if (nr >= 0 && nr < N && nc >= 0 && nc < N) { // 단락평가, 단축평가
//				System.out.println(arr[nr][nc]);
//			}
			// 2. 내 밖이야? 그러면 안할랭..
			if (nr <0 || nr >=N || nc < 0 || nc >= N) continue;
			System.out.println(arr[nr][nc]);
			
			
			
		} // 4방향을 보기 위함

	}

}
