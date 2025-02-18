
class MyQueue{
	
}


public class Queue01_선형큐 {
	public static int[] queue = new int[10];
	public static int front = -1;
	public static int rear = -1;

	public static void main(String[] args) {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
		enQueue(5);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
				

	}
	// 삽입
	public static void enQueue(int item) {
		// 포화 검사
		if (isFull()) {
			System.out.println("꽉 찼어");
		} else {
			queue[++rear] = item;
		}
	}
	
	// 삭제 (반환 타입은 필요한가?)
	public static int deQueue() {
		// 공백 검사를 하겠다
		if (isEmpty()) {
			System.out.println("꺼낼 것이 없는데용");
			return -1; // 반환하는 값은 보고 결정하장 -> 문제의 범위를 보고 구분할 수 있는지 보장
		}
		return queue[++front];
	}
	// 공백
	public static boolean isEmpty() {
		return front==rear;
	}
	// 포화
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	

}
