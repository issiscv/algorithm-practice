package section8_dfs_bfs;

import java.util.Scanner;

public class SevenCombination {

    static int[][] dx = new int[34][34];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int dfs = DFS(n, m);
        System.out.println(dfs);

    }

    private static int DFS(int n, int m) {
        if (dx[n][m] != 0) return dx[n][m];
        if (n == m || m == 0) {
            return 1;
        }

        return dx[n][m] = DFS(n-1, m-1) + DFS(n -1, m);
    }
}
