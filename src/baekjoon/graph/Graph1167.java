package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1167 {

    static List<List<Node>> list = new ArrayList<>();
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;

    private static class Node {
        int data;
        int distance;

        public Node(int data, int distance) {
            this.data = data;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            while (true) {
                int b = scanner.nextInt();
                if (b == -1) break;
                int distance = scanner.nextInt();

                list.get(a).add(new Node(b, distance));
            }
        }

        DFS(1, 0);
        visited = new boolean[N +1];
        DFS(node, 0);

        System.out.println(max);
    }

    private static int node;

    private static void DFS(int v, int sum) {
        if(sum > max) {
            max = sum;
            node = v;
        }
        visited[v] = true;
        max = Math.max(max, sum);
        for (Node node : list.get(v)) {
                int data = node.data;
                int distance = node.distance;
                if (!visited[data]) {
                    int answer = sum + distance;
                    DFS(data, answer);
                }
            }
    }
}
