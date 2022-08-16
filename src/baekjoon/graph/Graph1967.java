package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1967 {

    private static class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    static List<List<Node>> list = new ArrayList<>();
    static boolean[] visited;
    static int max;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        visited = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < N-1; i++) {
            int pNode = scanner.nextInt();
            int cNode = scanner.nextInt();
            int weight = scanner.nextInt();

            list.get(pNode).add(new Node(cNode, weight));
            list.get(cNode).add(new Node(pNode, weight));
        }

        max = Integer.MIN_VALUE;
        visited = new boolean[N + 1];
        DFS(1, 0);

        visited = new boolean[N+1];

        DFS(node, 0);

        System.out.println(max);
    }

    private static int node;

    private static void DFS(int v, int sum) {
        visited[v] = true;

        if (sum > max) {
            node = v;
        }

        max = Math.max(max, sum);

        for (Node node : list.get(v)) {
            int vertex = node.vertex;
            int weight = node.weight;
            if (!visited[vertex]) {
                DFS(vertex, sum + weight);
            }
        }
    }
}
