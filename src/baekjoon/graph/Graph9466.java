package baekjoon.graph;

import java.io.IOException;
import java.util.*;

public class Graph9466 {

    private static boolean[] isEnd;
    private static boolean[] ch;
    private static int[] arr;
    private static int n;
    private static int cnt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {

            n = scanner.nextInt();
            arr = new int[n +1];
            ch = new boolean[n +1];
            isEnd = new boolean[n +1];

            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
            }
            cnt = 0;
            for (int i = 1; i <= n; i++) {
                DFS(i);
            }
            System.out.println(n - cnt);
        }
    }

    private static void DFS(int v) {
        ch[v] = true;
        int next = arr[v];

        if (!ch[next]) {
            DFS(next);
        } else {

            if (!isEnd[next]) {
                cnt++;
                while (next != v) {
                    cnt++;
                    next = arr[next];
                }
            }
        }

        isEnd[v] = true;
    }
}
