import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기 {
	public static void main(String[] args) {
		// 원래 같았으면 입력을 받았을 것이야.
		String intfix = "(6+5*(2-8)/2)";
		
		// 연산자 우선순위
		// ( : 겉바속촉
		// + - : 동급 1
		// *, / : 동급 2
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		
		StringBuilder postfix = new StringBuilder();
		Stack<Character> op = new Stack<>(); // 연산자를 담을 수 있는 스택
		for (int i = 0; i<intfix.length(); i++) {
			// '(' 
			if (intfix.charAt(i) == '(') {
				// 우선순위는 겉바! 그냥 냅다 추가
				op.push(intfix.charAt(i));
			}
			// ')'
			else if (intfix.charAt(i)==')') {
				// 여는 괄호를 만날때까지 꺼내고, 버린다
				while(op.peek()!='(') {
					postfix.append(op.pop());
				}
				op.pop(); // top이 가리키는 여는 소괄호 버리기!!!
			}
			// 피연산자 (한자리라고 가정)
			else if (intfix.charAt(i) >= '0' && intfix.charAt(i)<='9') {
				postfix.append(intfix.charAt(i));
			}
			// 연산자
			else {
				// 공백이거나
				if (op.isEmpty()) op.push(intfix.charAt(i));
				// 공백이 아니거나
				else {
					// 연산자 우선순위를 비교해서 처리하겠다
					while(priority.get(op.peek()) >= priority.get(intfix.charAt(i)) && !op.isEmpty()) { 
						// 스택 안에 있는 최상위 친구의 우선순위가 더 크거나 같다면
						postfix.append(op.pop());
					}
					op.push(intfix.charAt(i));
				}
			}
		}// 중위 표기를 하나씩 읽어서 처리
		while(!op.isEmpty()) {
			postfix.append(op.pop());
		}
		System.out.println(postfix);
		////////////// ////////////////////// 계산
		Stack<Integer> calc = new Stack<>(); // 다시 재활용해도 괜찮고 아니면 이렇게 새롭게 만들어도 OKOK
		for (int i = 0; i<postfix.length(); i++) {
			// 피연산자라면
			if(postfix.charAt(i) >= '0' && postfix.charAt(i) <= '9') {
				// 이제 피연산자를 stack에 push
				calc.push(postfix.charAt(i)-'0');
			} else { // 연산자라면 (이제는 소괄호 없엉)
				// 꺼내는 순서 중요하다
				int B = calc.pop();
				int A = calc.pop();
				switch(postfix.charAt(i)) {
				case '+':
					calc.push(A+B);
					break;
				case '-':
					calc.push(A-B);
					break;
				case '*':
					calc.push(A*B);
					break;
				case '/':
					calc.push(A/B);
					break;
				}
			}
		}//후위계산for문
		System.out.println(calc.pop());
	}
}









