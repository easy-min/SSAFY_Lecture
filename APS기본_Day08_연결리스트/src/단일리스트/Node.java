package 단일리스트;

// 데이터필드, 링크(다음)필드
public class Node {
// 데이터필드를 String으로 고정했지만... 제네릭하게 처리할 수도 있음
	public String data;
	public Node Link;
//	public Node() {
//		// 주석을 해제해도 되고, 안해도 되는데 안한다는 것은 data가 없는 걸 생성하지 못해
//	}
	public Node(String data) {
		this.data = data;
		this.Link = null; // 이거 필요한강? (참조자료형은 어차피 기본 값은 null)
		// 아래의 기본 생성자를 생성하지 않으면... 
		
	}
	
}
