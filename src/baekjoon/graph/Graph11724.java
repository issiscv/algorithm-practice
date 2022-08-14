package baekjoon.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Graph11724 {

    private static List<List<Integer>> list = new ArrayList<>();
    private static boolean[] ch;
            
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        ch = new boolean[N+1];
        Arrays.fill(ch, true);

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (ch[i]) {
                DFS(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void DFS(int v) {
        ch[v] = false;

        for (int tmp : list.get(v)) {
            if (ch[tmp]) {
                DFS(tmp);
            }
        }
    }

}
