package baekjoon.bruteforcing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BruteForce2267 {

    private static int[] dx = {-1 ,0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int n;
    private static int[][] arr;
    private static int tmp = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    DFS(i, j);
                    list.add(tmp);
                    tmp = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(list.size());
        Collections.sort(list);
        for (Integer integer : list) {
            sb.append(integer).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void DFS(int i, int j) {

        arr[i][j] = 0;
        tmp++;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }
}
