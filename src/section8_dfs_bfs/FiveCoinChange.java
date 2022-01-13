package section8_dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FiveCoinChange {

    static int n;
    static Integer[] arr;
    static int total;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        total = scanner.nextInt();

        DFS(0, 0);
        System.out.println(answer);
    }

    private static void DFS(int v, int sum) {
        if (sum > total) return;
        if (v >= answer) return;
        if (sum == total) {
            answer = Math.min(answer, v);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(v+1, sum + arr[i]);
            }
        }
    }
}
