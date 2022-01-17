package section8_dfs_bfs;

import java.util.Scanner;

public class EightGuessPermutation {
    static int n, m;
    static int[] comb;
    static int[][] ch;
    static int[] p;
    static int[] c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        comb = new int[n];
        ch = new int[n][n];
        c = new int[n];
        p = new int[n];

        for (int i = 0; i < n; i++) {
            comb[i] = findComb(n-1, i);
        }

        DFS(0, 0);
    }

    private static void DFS(int v, int sum) {
        if (v == n) {
            if (sum == m) {
                for (int i = 0; i < n; i++) {
                    System.out.print(p[i] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (c[i] == 0) {
                    c[i] = 1;
                    p[v] = i+1;
                    DFS(v + 1, sum + (comb[v] * (p[v])));
                    c[i] = 0;
                }
            }
        }
    }

    private static int findComb(int i, int j) {
        if (ch[i][j] != 0) return ch[i][j];

        if (i == j || j == 0) {
            return 1;
        }
        return ch[i][j] = findComb(i-1, j-1) + findComb(i-1, j);
    }
}
