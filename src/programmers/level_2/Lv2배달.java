package programmers.level_2;

import java.util.*;

public class Lv2배달 {

    private static class Edge implements Comparable<Edge> {
        int node;
        int cost;

        public Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    private static List<List<Edge>> list = new ArrayList<>();
    private static int[] dis;

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        dis = new int[N+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] e : road) {
            list.get(e[0]).add(new Edge(e[1], e[2]));
            list.get(e[1]).add(new Edge(e[0], e[2]));
        }

        BFS();
        for (int i = 1; i <= N; i++) {
            if (dis[i] <= K) answer++;
        }
        return answer;
    }

    private static void BFS() {
        dis[1] = 0;
        Queue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(1, 0));

        while (!queue.isEmpty()) {
            Edge cur = queue.poll();

            int node = cur.node;
            int cost = cur.cost;

            for (Edge edge : list.get(node)) {
                if (dis[edge.node] > edge.cost + cost) {
                    dis[edge.node] = edge.cost + cost;
                    queue.offer(new Edge(edge.node, edge.cost + cost));
                }
            }

        }
    }

    public static void main(String[] args) {
        int n = 5;

        int[][] road = {
                {1, 2, 1},
                {2, 3, 3},
                {5, 2, 2},
                {1, 4, 2},
                {5, 3, 1},
                {5, 4, 2}
        };

        int k = 3;

        solution(n, road, k);
    }
}
