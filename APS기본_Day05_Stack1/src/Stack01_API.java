import java.util.Stack;

public class Stack01_API {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
//		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		// stack에 있는 모든 자료를 전부다 출력하고 싶어
		for (int i = 0; i<stack.size(); i++) { // stack의 size가 계속 변해서 하나 씹고 넘어가버림
			System.out.println(stack.pop());
		} // 올바르지 못해
		
		// 1. size 변수 미리 저장
		int size = stack.size();
		// 2. while문을 이용하자
		while(!stack.isEmpty()) {
			
		}
		// 3. for문을 거꾸로
		for (int i = stack.size(); i>0; i++) {
			
		}
		
		
		
		
		
		
		
		
		System.out.println(stack.isEmpty());
	}

}
