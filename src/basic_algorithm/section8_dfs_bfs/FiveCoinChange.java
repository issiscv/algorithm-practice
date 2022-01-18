package basic_algorithm.section8_dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FiveCoinChange {
    static int n, m;
    static int min = Integer.MAX_VALUE;
    static Integer[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        m = scanner.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        DFS(0, 0);
        System.out.println(min);
    }

    private static void DFS(int v, int sum) {
        if (sum > m) return;
        if (v > m) return;
        if (v > min) return;
        if (sum == m) {
            min = Math.min(min, v);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(v+1, sum + arr[i]);
            }
        }
    }


}
