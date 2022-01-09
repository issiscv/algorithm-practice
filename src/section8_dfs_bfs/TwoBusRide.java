package section8_dfs_bfs;

import java.util.Scanner;

public class TwoBusRide {

    static int n, m;
    static int[] arr;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        DFS(0,0, arr);

        System.out.println(max);
    }

    private static void DFS(int s, int sum, int[] arr) {

        if (sum > n) return;
        if (s == m) {
            max = Math.max(max, sum);
        }
        else {
            DFS(s+1, sum + arr[s], arr);
            DFS(s+1, sum, arr);
        }
    }
}
