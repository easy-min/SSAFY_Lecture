package 이차원배열;

public class Array09_달팽이순회 {
	// 해결 방법은 엄청나게 많다!
	public static void main(String[] args) {
		int N = 4;
		int[][] arr = new int[N][N];
		int k = N; // k만큼 길이를 이동할거야.
		int dir = 1; // 증감을 위한 친구! 1이 되었다가 -1이 되기도 했다가 왔다갔다
		int r = 0;
		int c = -1; // 출발을 -1로 초기화 (0으로 해도 괜찮긴해)
		int num = 1;
		while (true) {
			// 수평 -> 수직
			for (int i = 0; i < k; i++) {
				c += dir; // -1에서 출발했으니깐
				arr[r][c] = num++;
			}
			k--;
			// 종료 조건
			// num == N*N
			// K == 0
			// (r,c) == (중앙 좌표)일 때 등 여러 가지가 있다!
			if (k==0) break;
			
			// 수직 -> 수평
			for (int i = 0; i<k; i++) {
				r+= dir;
				arr[r][c] = num++;
			}
			dir = -dir;
			
			

		} // 무한 루프
		for (int i = 0; i<N; i++) {
			for (int j =0; j<N; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

		//

	}

}
