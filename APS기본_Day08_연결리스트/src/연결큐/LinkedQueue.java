package 연결큐;

public class LinkedQueue {
	public Node front;
	public Node rear;
	// 삽입
	public void enQueue(int data) {
		// 새로운 노드 생성
		Node node = new Node(data);
		// front, rear 하나가 널이면 공백 큐!
		if(front==null) {
			front = rear = node; // 대입연산자는 오른쪽에서 왼쪽으로 이동함
		} else {
			rear.link = node;
			rear = node; // 아래랑 같은 의미
//			rear = rear.link;
			
		}
	}
	// 삭제
	public int deQueue() {
		if (front!=null) {
			int data = front.data;
			front = front.link; // 프론트는 프론트가 가지고 있는 링크로 이동할꺼얌
			return data;
		}
		return -1; // 고민이 필요하다
	}
}
