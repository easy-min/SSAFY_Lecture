// 클래스로 빼서 만들어도 좋다!

// static하게 만들겠다
public class Stack02_배열구현 {
	// 배열을 이용해서 만든다
	static String[] stack = new String[10];
	// 크기를 얼마로 해야 하는가???
	// 계산하기 싫으면 10만 ~ 100만 사이 정도 크기로 결정하기
	static int top = -1; // 초기화
	// -1은 스택이 공백상태라는 뜻!

	public static void main(String[] args) {
		push("짜장면");
		push("탕수육");
		push("수제비");
		push("수제비");
		push("수제비");
		push("수제비");
		push("수제비");
		push("수제비");		
		push("수제비");
		push("수제비");		
		push("수제비");
		push("수제비");		
		push("수제비");
		System.out.println(peek());
	}

	// 삽입(push)
	static boolean push(String value) {
		// 배열이니깐
		if (isFull()) {
			System.out.println("가득 찼어");
			// 배열의 크기를 두 배로 늘려서 다시 복사해도 OK
			return false;
		}
		stack[++top] = value;
		return true;
	}

	// 삭제(pop)
	static String pop() {
		if (isEmpty()) {
			System.out.println("뺄 것이 없는데?"); return null;
		}
		return stack[top--]; // 굳이 stack[pop] = null 안해도 push할 때 덮어버리니깐 괜찮괜찮
		
	}

	// 조회(peek)
	static String peek() {
		if (isEmpty()) System.out.println("공백인데?"); 
		return stack[top];
	}

	// 공백(Empty)
	static boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	static boolean isEmpty2() {
		return top == -1;
	}

	// 포화(full) : 이거는 배열이라서...
	static boolean isFull() {
		return top == stack.length - 1;
	}
}
