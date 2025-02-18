import java.util.Arrays;
import java.util.Scanner;

public class Array02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt(); //1 3 4 2 0 3 5
									   //1342035 
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
