package Day04백트래킹;

public class 순열01_반복문 {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3};
		int N = nums.length;
		
		// 반복문을 이용해서 (원소의 수 만큼 중첩)
		for (int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) { // 조합과 달리 j가 0부터 시작함
				if(i!=j) {
					for(int k = 0; k<N; k++) {
						if(k!=i && k!=j) {
							System.out.printf("%d %d %d\n", nums[i], nums[j], nums[k]);
						}
					}//[2]
				}//j조건 확인
				
			}//[1]
		}//[0]

	}

}
