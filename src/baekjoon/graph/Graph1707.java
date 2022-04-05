package baekjoon.graph;

import java.util.*;

public class Graph1707 {

    static int[] color;
    private static int n;
    private static int m;
    private static List<List<Integer>> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();

            list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                list.get(a).add(b);
                list.get(b).add(a);
            }

            color = new int[n + 1];
            isBiGraph();
        }
    }

    public static void isBiGraph() {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (color[i] == 0) {
                color[i] = 1;
                queue.offer(i);
            }

            while (!queue.isEmpty()) {
                int poll = queue.poll();

                for (int next : list.get(poll)) {

                    if (color[next] == color[poll]) {
                        System.out.println("NO");
                        return;
                    }

                    if (color[next] == 0) {
                        if (color[poll] == 1) {
                            color[next] = 2;
                        } else {
                            color[next] = 1;
                        }
                    }
                }
            }

            System.out.println("YES");
        }
    }
}
