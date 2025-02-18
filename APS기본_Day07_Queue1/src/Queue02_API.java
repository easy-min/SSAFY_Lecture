import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {

	public static void main(String[] args) {
		// queue는 인터페이스... 니가 직접 구현하던가 아니면 
		Queue<Integer> queue = new LinkedList();
		
		// 추가
		queue.add(1);
		queue.offer(2);
		
		// 삭제
		queue.remove();
		queue.poll();
		
		// 조회
		queue.element();
		queue.peek();
		
		// 윗줄 삼총사 add, remove, element -> 예외를 발생시킴
		// 아랫줄 삼총사 offer, poll, peek -> 값을 리턴

	}

}
