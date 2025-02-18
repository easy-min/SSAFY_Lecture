import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue04_마이쮸시뮬레이션 {
	static class Person{ // 이너클래스
		int num;
		int cnt;
		public Person() {
			// TODO Auto-generated constructor stub
		}
		public Person(int num, int cnt) {
			super();
			this.num = num;
			this.cnt = cnt;
		}
		@Override
		public String toString() {
			return "Person [num=" + num + ", cnt=" + cnt + "]";
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc<=T; tc++) {
			int ans = 0;
			int N = sc.nextInt();
			int pNum = 1;
//			Queue<int[]> queue = new LinkedList<>();
			// [0]이 번호이고 [1]이 개수이야
			Queue<Person> queue = new LinkedList<>();
			queue.add(new Person(pNum++, 1));
			while(N>0) {
				Person p = queue.poll(); // 가장 먼저 들어온 친구!
				N -= p.cnt; // 내가 N개가 있었는데 줘버렸엉
				if(N<=0) {
					// 그만행
					ans = p.num;
					break;
				} else {
					// P는 재빠르게 가서 다시 줄을 선다!
					System.out.println(p);
					p.cnt++;
					queue.add(p);
					// 다음 번호의 사람이 줄을 선다!
					queue.add(new Person(pNum++, 1));
				}
			}
			System.out.println("#"+tc+" "+ans);
			
		}

	}

}
