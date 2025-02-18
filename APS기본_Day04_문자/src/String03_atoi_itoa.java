// 문자열 -> 정수 / 정수 -> 문자열
public class String03_atoi_itoa {

	public static void main(String[] args) {
		String strNum = "-123456"; // -일 때는 오류가 터진다.
		int num = Integer.parseInt(strNum);
		System.out.println(atoi(strNum));
		
		String strNum2 = String.valueOf(num);
		String strNum3 = num+""; // 형변환
	}
	// 만약에 str이 음수라면? 실수라면??
	static int atoi(String str) {
		// 우리가 직접 만들면 전부 처리 가능~
		int N = str.length();
		int num = 0;
		
		// str : 1, 2, 3, 4, 5, 6
		for (int i = 0; i<N; i++) {
			char c = str.charAt(i);
			// 음.. 이거 숫자인가?
			if ('0' <= c && c <= '9') { // '0' = 48
				num = (num*10)+ (c-'0'); // 48을 빼야 함!!!
			} else {
				return Integer.MIN_VALUE; // integer가 표현할 수 있는 가장 낮은 수가 들어간다
			}
		}
		return num;
	}

}
