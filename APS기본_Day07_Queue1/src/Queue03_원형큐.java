import java.util.Arrays;

public class Queue03_원형큐 {
	public static String[] cQ = new String[5];
	public static int front = 0, rear = 0; // 한 칸 비워둘 예정
	
	
	public static void main(String[] args) {
		System.out.println(enQueue("김도훈"));
		System.out.println(enQueue("박승연"));
		System.out.println(enQueue("강건"));
		System.out.println(enQueue("문하은"));
		System.out.println(Arrays.toString(cQ));
		System.out.println(deQueue());
		System.out.println(enQueue("eizi"));
		System.out.println(Arrays.toString(cQ));
		System.out.println("여기서 김도훈은 null이다!");
		
		
	}
	
	// 삽입
	public static boolean enQueue(String item) {
		if(isFull()) {
			return false;
		}
		rear = (rear+1)%cQ.length;
		cQ[rear] = item;
		return true;
	}
	
	// 삭제
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("공백 상태!");
			return null;
		}
		front = (front+1)%cQ.length;
		return cQ[front]; // 실제 데이터는 지우지 않음!
		// rear를 통해 데이터를 덮어버리니깐 크게 상관은 없다!
	}
	
	
	// 공백 (선형큐와 동일함!)
	public static boolean isEmpty() {
		return front==rear;
	}
	
	// 포화 (한 칸을 비워 둘 거야!!!)
	public static boolean isFull() {
		return front == (rear+1)%cQ.length;
	}
}
