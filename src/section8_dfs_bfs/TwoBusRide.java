package section8_dfs_bfs;

import java.util.Scanner;

public class TwoBusRide {

    static int[] arr;
    static int n, m;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        DFS(0, 0);
        System.out.println(max);
    }

    private static void DFS(int v, int sum) {

        if (v == m) {
            if (sum <= n) {
                max = Math.max(max, sum);
            }
        } else {
            DFS(v+1, sum + arr[v]);
            DFS(v+1, sum);
        }
    }

}
