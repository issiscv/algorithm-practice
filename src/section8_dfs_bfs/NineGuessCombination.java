package section8_dfs_bfs;

import java.util.Scanner;

public class NineGuessCombination {

    static int n, m;
    static int[] c;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        c = new int[m];

        DFS(0, 1);

    }

    private static void DFS(int v, int s) {

        if (v == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                    c[v] = i;
                    DFS(v+1, i+1);
            }
        }
    }
}
