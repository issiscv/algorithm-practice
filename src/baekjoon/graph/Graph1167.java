package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1167 {


    private static class Node {
        int number;
        int weight;

        public Node(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }
    }

    static List<List<Node>> list = new ArrayList<>();
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            int pNumber = scanner.nextInt();
            while (true) {
                int cNumber = scanner.nextInt();
                if (cNumber == -1) break;
                int distance = scanner.nextInt();
                list.get(pNumber).add(new Node(cNumber, distance));
            }
        }

        DFS(1, 0);
        visited = new boolean[N+1];
        DFS(node, 0);

        System.out.println(max);
    }

    private static int node;

    private static void DFS(int v, int sum) {
        visited[v] = true;

        if (sum > max) {
            max = sum;
            node = v;
        }

        for (Node node : list.get(v)) {
            int number = node.number;
            int weight = node.weight;

            if (!visited[number]) {
                DFS(number, sum + weight);
            }
        }
    }
}
