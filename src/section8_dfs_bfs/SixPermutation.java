package section8_dfs_bfs;

import java.util.Scanner;

public class SixPermutation {

    static int n, m;
    static int[] arr;
    static int[] ch;
    static int[] pm;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();//3
        m = scanner.nextInt();//2
        arr = new int[n];
        ch = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        DFS(0);
    }

    private static void DFS(int v) {
        if (v == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[v] = arr[i];
                    DFS(v+1);
                    ch[i] = 0;
                }
            }
        }
    }
}
