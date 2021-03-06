package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph11725 {

    private static List<List<Integer>> list;
    private static int[] parent;
    private static boolean[] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        parent = new int[N+1];
        visit = new boolean[N+1];
        list = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 1; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        DFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }

    private static void DFS(int v) {
        visit[v] = true;

        for (int i : list.get(v)) {
            if (!visit[i]) {
                parent[i] = v;
                DFS(i);
            }
        }
    }
}
