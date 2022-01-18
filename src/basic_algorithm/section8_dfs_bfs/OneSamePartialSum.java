package basic_algorithm.section8_dfs_bfs;

import java.util.Scanner;

public class OneSamePartialSum {

    static int[] arr;
    static int n;
    static int total = 0;
    static boolean flag = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        DFS(0, 0);

        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }

    private static void DFS(int v, int sum) {

        if (v == n) return;
        if (total / 2 < sum) return;
        if (total - sum == sum) {
            flag = true;
        } else {
            DFS(v + 1, sum + arr[v]);
            DFS(v + 1, sum);
        }

    }
}
