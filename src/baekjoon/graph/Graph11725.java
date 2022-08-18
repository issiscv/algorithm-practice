package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph11725 {

    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        visited = new boolean[N+1];
        parent = new int[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
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
        visited[v] = true;

        for (int tmp : list.get(v)) {
            if (!visited[tmp]) {
                parent[tmp] = v;
                DFS(tmp);
            }
        }
    }
}
