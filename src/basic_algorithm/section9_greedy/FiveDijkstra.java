package basic_algorithm.section9_greedy;

import java.util.*;

public class FiveDijkstra {

    static int[] dis;
    static int n, m;
    static List<List<Node>> graph = new ArrayList<>();

    static class Node implements Comparable<Node> {

        int v;
        int c;

        public Node(int v, int c) {
            this.v = v;
            this.c = c;
        }

        @Override
        public int compareTo(Node o) {
            return this.c-o.c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            graph.get(a).add(new Node(b, c));
        }

        BFS(1);

        for (int d : dis) {
            System.out.println(d);
        }
    }

    /**
     6 9
     1 2 12
     1 3 4
     2 1 2
     2 3 5
     2 5 5
     3 4 5
     4 2 2
     4 5 5
     6 4 5
     */
    private static void BFS(int v) {
        Queue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(v, 0));
        dis[v] = 0;
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();//(1, 0);
            int now = tmp.v;
            int nowCost = tmp.c;

            for (Node node : graph.get(now)) {
                if (dis[node.v] > nowCost + node.c) {
                    dis[node.v] = nowCost + node.c;
                    queue.offer(new Node(node.v, nowCost + node.c));
                }
            }

        }

    }
}
