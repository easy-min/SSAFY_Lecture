package 연결스택;

public class LinkedStack {
	public Node top; // 포인터 변수가 한 개 필요!
	// 삽입
	public void push(int data) {
		Node node = new Node(data); // 새로운 노드 생성
		node.link = top; // top이 가리키는 주소를 넣는다.
		top = node;
		
	}
	
	
	// 삭제
	public int pop() {
		if(top==null) {
			// 공백 스택
			return -1; // 냅다 -1하면 안된당 (문제의 범위를 고려할 것!)
		}
		int data = top.data;
		top = top.link; // 눌러 버리기
		return data;
	}
	
	// 조회
	public int peek() {
		if (top==null) return -1;
		return top.data;
	}
	public boolean isEmpty() {
		return top==null;
	}
	

}
