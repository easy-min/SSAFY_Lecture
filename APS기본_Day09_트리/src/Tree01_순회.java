
public class Tree01_순회 {
	public static char[] tree = new char[] {'\u0000', 'A','B','C','D','E','F','G',' ', ' ', 'H','I'};
	public static int N = tree.length;
	public static void main(String[] args) {
		System.out.print("전위 순회 : ");
		preOrder(1); // 루트를 넣기
		System.out.println();
		System.out.print("중위 순회 : ");
		inOrder(1);
		System.out.println();
		System.out.print("후위 순회 : ");
		postOrder(1);
		System.out.println();
	}
	// 전위 순회
	// int v는 노드의 번호
	public static void preOrder(int v) {
		// v라는 노드의 번호가 유효한지 확인
		if (v<N) {
			// 방문 처리 '\u0000'.도 체크해주면 좋음!
			if (tree[v] != ' ') System.out.print(tree[v]+" ");
			// 왼쪽 자식 탐방
			preOrder(v*2);
			// 오른쪽 자식 탐방
			preOrder(v*2+1);
		}
	}
	public static void inOrder(int v) {
		// v라는 노드의 번호가 유효한지 확인
		if (v<N) {
			// 왼쪽 자식 탐방
			inOrder(v*2);
			// 방문 처리 '\u0000'.도 체크해주면 좋음!
			if (tree[v] != ' ') System.out.print(tree[v]+" ");
			// 오른쪽 자식 탐방
			inOrder(v*2+1);
		}
	}
	// 후위 순회
	public static void postOrder(int v) {
		// v라는 노드의 번호가 유효한지 확인
		if (v<N) {
			// 왼쪽 자식 탐방
			postOrder(v*2);
			// 오른쪽 자식 탐방
			postOrder(v*2+1);
			// 방문 처리 '\u0000'.도 체크해주면 좋음!
			if (tree[v] != ' ') System.out.print(tree[v]+" ");
		}
	}
	

	

	
}











