package basic_algorithm.section8_dfs_bfs;

import java.util.Scanner;

public class SixPermutation {

    static int n, m;
    static int[] arr;
    static int[] ch;//체크
    static int[] pm;//순열
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

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
                if (i != 0) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {//3
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[v] = arr[i];
                    DFS(v + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
