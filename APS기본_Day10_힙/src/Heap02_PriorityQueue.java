import java.util.PriorityQueue;

public class Heap02_PriorityQueue {

	public static void main(String[] args) {
		//최소힙이 기본이구나..
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// 비교 기준을 넣으면 최대 힙으로 할 수 있지만 그런데 몰랑!
		// 음수로 넣어버리면 된다!
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(19);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}

}
