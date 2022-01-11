package section7_recursive_tree_graph;

import java.util.*;

public class ElevenGraphBFS {

    static int[] ch;
    static int[] dis;
    static List<List<Integer>> list = new ArrayList<>();

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

        for (int i = 1; i < dis.length; i++) {
            System.out.println(dis[i]);
        }
    }

    private static void BFS(int i) {
        ch[i] = 1;
        dis[i] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        while (!queue.isEmpty()) {

            int tmp = queue.poll();

            for (int x : list.get(tmp)) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    dis[x] = dis[tmp] + 1;
                    queue.offer(x);
                }
            }
        }
    }
}
