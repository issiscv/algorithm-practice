package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph1167 {

    private static List<List<Node>> list;
    private static boolean[] visit;
    private static int v;
    private static int max = Integer.MIN_VALUE;

    private static class Node {
        int node;
        int value;

        public Node(int node, int value) {
            this.node = node;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        v = scanner.nextInt();
        list = new ArrayList<>();
        visit = new boolean[v +1];

        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= v; i++) {
            int node = scanner.nextInt();
            while (true) {
                int tNode = scanner.nextInt();
                if (tNode == -1) break;
                int value = scanner.nextInt();

                list.get(node).add(new Node(tNode, value));
            }
        }

        DFS(1, 0);
        visit = new boolean[v +1];
        DFS(node, 0);

        System.out.println(max);
    }

    private static int node;
    private static void DFS(int v, int sum) {
        if(sum > max) {
            max = sum;
            node = v;
        }
        visit[v] = true;
        for (Node node : list.get(v)) {
            if (!visit[node.node]) {
                DFS(node.node, sum + node.value);
            }
        }
    }
}
