package 문제2210숫자판점프;

import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static Set<String> nums = new HashSet<>();
    static int[] dirx = {-1, 1, 0, 0}; // 상하좌우
    static int[] diry = {0, 0, -1, 1}; // 상하좌우

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("res/문제2210숫자판점프.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[5][5];

        // 숫자판 입력 받기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 모든 좌표에서 DFS 실행
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, String.valueOf(arr[i][j]), 0);
            }
        }

        System.out.println(nums.size()); // 정답 출력
    }

    public static void dfs(int x, int y, String num, int count) {
        if (count == 5) { // 6자리 숫자가 완성되면 HashSet에 저장
            nums.add(num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int curx = x + dirx[i];
            int cury = y + diry[i];

            // 유효한 좌표 범위 확인
            if (curx >= 0 && curx < arr.length && cury >= 0 && cury < arr[0].length) {
                dfs(curx, cury, num + arr[curx][cury], count + 1); // curx, cury 사용
            }
        }
    }
}
