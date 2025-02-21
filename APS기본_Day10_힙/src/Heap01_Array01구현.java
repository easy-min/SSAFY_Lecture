// maxHeap 최대 힙 기준

import java.util.Arrays;

public class Heap01_Array01구현 {
	static int[] heap;
	static int heapSize;

	public static void main(String[] args) {
		// 문제
		int N = 100; // 실제 문제의 입력을 보고 판단
		heap = new int[N];
		heapSize = 0;

		System.out.println(Arrays.toString(heap));
		heapPush(10);
		System.out.println(Arrays.toString(heap));
		heapPush(20);
		System.out.println(Arrays.toString(heap));
		heapPush(15);
		System.out.println(Arrays.toString(heap));
		heapPush(19);
		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());

	}

	// heap toString(null) 형에 맞게 아이템이 들어온다.
	public static void heapPush(int item) {
		heap[++heapSize] = item; // 마지막 자리에 삽입
		int ch = heapSize;
		int p = ch / 2; // 버림이 필요한데.. 정수형이라 버려짐 ㅎ
		// 올릴 수 있으면 올라가
		while (p > 0 && heap[p] < heap[ch]) {
			// swap

			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			ch = p;
			p = ch / 2;
		}
	} // heapPush
	
	public static int heapPop() {
		// 힙이 공백이면 안해~~
		if (heapSize==0) return -1; // 이 또한 불안할지도 (주어진 값이 어디 범위인지를 보고 판단)
		int item = heap[1];// 루트 노드의 값을 저장해놓았다
		//막내를 수장의 자리에 올려놓는다.
		heap[1] = heap[heapSize--];
		int p = 1;
		int ch = p*2; // 왼자 세팅
		if (ch+1<=heapSize && heap[ch] < heap[ch+1]) ch+=1; // 왼자로 셋팅해두고 안 되면 오른쪽으로 교환
		// 내려갈 수 있으면 내려가~
		while(ch<=heapSize && heap[p] < heap[ch]) { // ch가 heapSize보다 작은지 꼭 확인하기
			int tmp = heap[p]; // 중복되는게 싫다면 swap을 메서드로 뺄 수도 있다
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			p = ch;
			ch = p*2; // 왼자셋팅
			if (ch+1<=heapSize && heap[ch] < heap[ch+1]) ch+=1; // 왼자로 셋팅해두고 안 되면 오른쪽으로 교환
			
		}
		return item;
		
		
	}

}













