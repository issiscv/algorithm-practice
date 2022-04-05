package baekjoon.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Graph10451 {

    private static List<List<Integer>> list;
    private static int[] arr;
    private static boolean[] ch;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = scanner.nextInt();

            arr = new int[N+1];
            ch = new boolean[N+1];
            Arrays.fill(ch, true);
            for (int i = 1; i <= N; i++) {
                arr[i] = scanner.nextInt();
            }

            list = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                list.add(new ArrayList<>());
            }

            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                if (ch[i]) {
                    DFS(i, true);
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void DFS(int start, boolean flag) {
        if (flag) {
            if (ch[start]) {
                ch[start] = false;
                DFS(arr[start], false);
            }
        } else {
            if (ch[start]) {
                ch[start] = false;
                DFS(arr[start], true);
            }
        }
    }
}
