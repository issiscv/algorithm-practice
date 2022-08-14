package baekjoon.graph;

import java.util.*;

public class Graph1707 {

    static List<List<Integer>> list;
    static int[] color;
    static boolean isBiGraph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int V = scanner.nextInt();
            int E = scanner.nextInt();

            list = new ArrayList<>();
            color = new int[V+1];
            isBiGraph = true;

            for (int i = 0; i <= V; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                list.get(a).add(b);
                list.get(b).add(a);
            }

            for (int i = 1; i <= V; i++) {
                if (!isBiGraph) break;

                if (color[i] == 0)
                    BFS(i);
            }

            System.out.println(isBiGraph ? "YES" : "NO");
        }
    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        color[v] = 1;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int tmp : list.get(poll)) {
                if (color[tmp] == 0) {
                    if (color[poll] == 1) {
                        color[tmp] = -1;
                    } else {
                        color[tmp] = 1;
                    }
                    queue.offer(tmp);
                } else if (color[tmp] + color[poll] != 0) {
                    isBiGraph = false;
                    break;
                }
            }

            if (!isBiGraph) {
                break;
            }
        }

    }
}
