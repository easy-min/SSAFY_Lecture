import java.util.PriorityQueue;
import java.util.Scanner;

class Solution1 {
    public static void main(String[] args) {
    	PriorityQueue<Integer> smaller = new PriorityQueue<>();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	for (int i = 0; i < 5; i++) {
    		smaller.add(sc.nextInt());
    	}
    	
    	System.out.println(smaller.poll());
    }
}