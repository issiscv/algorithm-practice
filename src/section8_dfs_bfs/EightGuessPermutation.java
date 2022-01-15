package section8_dfs_bfs;

import java.util.Scanner;

public class EightGuessPermutation {

    static int n, m;
    static int[] combArr, ch, p;
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        combArr = new int[n];
        ch = new int[n];
        p = new int[n];

        for (int i = 0; i < n; i++) {
            combArr[i] = comb(n-1, i);
        }

        DFS(0, 0);
    }

    private static void DFS(int v, int sum) {
        if (flag) return;
        if (v == n) {
            if (sum == m) {
                flag = true;
                for (int i : p) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[v] = i+1;
                    DFS(v+1, sum + (combArr[v] * p[v]));
                    ch[i] = 0;
                }
            }
        }
    }

    private static int comb(int i, int j) {
        if (i == j || j == 0) {
            return 1;
        }
        return comb(i-1, j-1) + comb(i-1, j);
    }


}
