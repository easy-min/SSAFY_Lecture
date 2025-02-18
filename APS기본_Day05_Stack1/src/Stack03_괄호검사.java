import java.util.HashMap;
import java.util.Stack;
// 여러가지 괄호를 고민해야 한다면...?
// 코드는 많이 복잡해질 수도 있당. 
// map을 활용할 수도, switch, 배열... 엄청 많이많이

public class Stack03_괄호검사 {

	public static void main(String[] args) {
		String str = "(a+b)()()(()((())))"; // 올바른 것
		
		// 괄호 검사
		// 1. 괄호의 개수는 동일해야 함 (여는 괄호 / 닫는 괄호)
		// 2. 여는 괄호는 닫는 괄호보다 먼저 나와야 함
		// 3. 괄호는 포함관계여야 한다.
		
		Stack<Character> stack = new Stack<>();
		boolean isOk = true; // 어떤 값으로 초기화할지는 목적을 잘 생각해볼것!!
		for (int i = 0; i<str.length(); i++) {
			// 1. 여는 괄호라면.. 무조건 넣어
			if (str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}
			// 2. 닫는 괄호라면 고민 포인트
			else if(str.charAt(i)==')'){
				// 2-1 스택이 공백이라면.. : 닫는 괄호가 먼저 나와버렸어 ㅠ
				if (stack.isEmpty()) {
					isOk = false;
					break;
				} else {
					char c = stack.pop(); // 검사
				}
			} else {
				
			}
		} // 괄호검사 끝
		// 정답 출력 (정답 isOk = T / 정답이 아닌 경우 isOK = F or 공백 X)
		if (isOk && stack.isEmpty()) {
			System.out.println("정답");
		} else {
			System.out.println("거짓");
		}
		
		
		

	}

}
