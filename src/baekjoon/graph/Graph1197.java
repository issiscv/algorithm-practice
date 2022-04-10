package baekjoon.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Graph1197 {

    private static List<Node> list;
    private static int[] unf;
    private static int sum;

    private static class Node implements Comparable<Node>{
        int node1;
        int node2;
        int cost;

        public Node(int node1, int node2, int cost) {
            this.node1 = node1;
            this.node2 = node2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }


    public static int find(int a) {
        if (a == unf[a])
            return a;
        else
            return unf[a] = find(unf[a]);
    }

    public static void union(int fa, int fb) {
        unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        list = new ArrayList<>();
        unf = new int[V+1];

        for (int i = 1; i <= V; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < E; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            list.add(new Node(a, b, c));
        }

        Collections.sort(list);
        sum = 0;
        for (Node node : list) {
            int fa = find(node.node1);
            int fb = find(node.node2);

            if (fa != fb) {
                union(fa, fb);
                sum += node.cost;
            }
        }

        System.out.println(sum);
    }
}
