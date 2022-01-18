package basic_algorithm.section7_recursive_tree_graph;

import java.util.*;

public class ElevenGraphBFS {

    static List<List<Integer>> list = new ArrayList<>();
    static int[] ch;
    static int[] dis;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ch = new int[n+1];
        dis = new int[n+1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list.get(a).add(b);
        }

        BFS(1);

        for (int i = 0; i < dis.length; i++) {
            System.out.println(dis[i]);
        }
    }


    private static void BFS(int v) {
        dis[v] = 0;
        ch[v] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        while (!queue.isEmpty()) {

            int tmp = queue.poll();
            for (int x : list.get(tmp)) {
                if (ch[x] == 0) {
                    queue.offer(x);
                    ch[x] = 1;
                    dis[x] = dis[tmp] + 1;
                }
            }
        }
    }
}
