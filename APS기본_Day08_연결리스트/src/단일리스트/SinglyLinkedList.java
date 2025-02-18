package 단일리스트;

public class SinglyLinkedList {
	private Node head; // 연결 리스트의 시작점
	private int size;
	
	public SinglyLinkedList() {
		// 없어도 괜찮앙
		this.head = null; // 전부다 기본 값이라서
		this.size = 0;
	}
	public Node get(int idx) { // 음수인지 index 벗어났는지
		// idx<0 : 그냥 0번 인덱스로, idx>=size일 때는 마지막 인덱스로
		if (idx<0 || idx>=size) return null;
		Node curr = head;
		// curr 해당 노드를 idx 위치까지 옮기겠다
		for (int i = 0; i<idx;i++) {
			curr = curr.Link;
		}
		return curr;
	}
	// 노드를 추가 (첫번째 위치, 마지막 위치, 중간 위치)
	// data가 필요한데 Node가 가지고 있는 데이터
	// Node를 파라미터로 가지고 있어도 가능
	public void addFirst(String data) {
		// 1. 노드를 생성한다.
		Node node = new Node(data);
		// 2. 노드의 링크는 head
		node.Link = head;
		// 3. head를 새로 만든 노드로 바꾼다!!
		head = node;
		size++;
	}
	public void addLast(String data) {
		if (size==0) {
			addFirst(data);
			return;
		}
		Node node = new Node(data);
		Node curr = head; // 마지막 노드를 찾을 변수
		while (curr.Link !=null) {
			curr = curr.Link;
		}
		curr.Link = node;
		size++;
	}
	public void add (int idx, String data) {
		if (idx<0 || idx>size) {
			// 앞의 상황이면 가장 앞에. 뒤의 상황이면 가장 뒤에
			return; // 너무 벗어났을 때 안해
		}
		if (idx ==0) {
			addFirst(data);
			return;
		}
		if (idx ==size) {
			addLast(data);
			return;
		}
		// 내가 넣고 싶은 위치의 이전 노드를 가져와야 한다
		Node pre = get(idx-1);
		Node node = new Node(data);
		// 순서 중요
		node.Link = pre.Link;
		pre.Link = node;
		size++;
	}
	// 삭제 (첫번째, 마지막 위치, 중간 위치)
	public String remove() {
		if(head ==null) {
			return null; // 예외 발생도 가능
		}
		String data = head.data;
		head = head.Link;
		size--;
		return data;
	}
	public String remove(int idx) {
		if (idx==0) return remove();
		// 범위를 벗어났으면
		if (idx<0 || idx>=size) return null;
		Node pre = get(idx-1); // 이전 노드
//		Node rm = get(idx); // 삭제 노드
		Node rm = pre.Link; //O(1)
		String data = rm.data;
		pre.Link = rm.Link; // 삭제 노드 이전의 링크로 연결
//		pre.Link = pre.Link.Link;
		size--;
		return data;
	}
	public void printList()
	{
		Node curr = head;
		if(head==null) {
			System.out.println("지금 공백리스트야 미안해");
		}
		while(curr != null) {
			System.out.print(curr.data+" -> ");
			curr = curr.Link;
		}
		System.out.println();
	}
}
































