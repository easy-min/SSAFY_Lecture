import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
	
	static int MOD = 20171109;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> bigger = new PriorityQueue<>();
		int mid;
		int total;
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			bigger.clear();
			smaller.clear();
			mid = Integer.parseInt(st.nextToken());
			total = 0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 2; j++) {
					int n = Integer.parseInt(st.nextToken());
					if (n > mid) bigger.add(n);
					else smaller.add(n);
				}
				
				if (smaller.size() > bigger.size()) {
					int tmp = smaller.poll();
					bigger.add(mid);
					mid = tmp;
				}
				else if (smaller.size() < bigger.size()) {
					int tmp = bigger.poll();
					smaller.add(mid);
					mid = tmp;
				}
				
				total = (total + (mid%MOD)) % MOD;
			}
			System.out.printf("#%d %d\n", tc, total);
		}
	}
}
