package basic_algorithm.section9_greedy;

import java.util.*;

public class EightPrim {

    static int n, m, answer = 0;
    static List<List<Node>> graph = new ArrayList<>();
    static int[] dis, ch;

    private static class Node implements Comparable<Node> {
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

        ch = new int[n+1];
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        BFS(1);
        System.out.println(answer);
    }

    private static void BFS(int v) {
        Queue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(v, 0));
        dis[v] = 0;

        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            int now=tmp.v;

            if(ch[now]==0){
                ch[now]=1;
                answer+=tmp.c;
                for(Node ob : graph.get(now)){
                    if(ch[ob.v]==0) queue.offer(new Node(ob.v, ob.c));
                }
            }
        }
    }
}
