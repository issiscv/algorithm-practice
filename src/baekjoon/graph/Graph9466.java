package baekjoon.graph;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Graph9466 {

    static boolean[] ch;
    static boolean[] end;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            arr = new int[N+1];
            ch = new boolean[N+1];
            end = new boolean[N+1];

            cnt = 0;

            Arrays.fill(ch, true);
            Arrays.fill(end, true);

            for (int i = 1; i <= N; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 1; i <= N; i++) {
                DFS(i);
            }
            System.out.println(N-cnt);
        }
    }

    private static void DFS(int v) {
        ch[v] = false;
        int next = arr[v];

        if (ch[next]) {
            DFS(next);
        } else {
            if (end[next]) {
                cnt++;
                while (next != v) {
                    next = arr[next];
                    cnt++;
                }
            }

        }

        end[v] = false;
    }
}
