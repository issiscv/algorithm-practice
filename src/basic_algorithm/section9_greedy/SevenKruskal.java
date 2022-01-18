package basic_algorithm.section9_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SevenKruskal {
    static int[] dis;
    static List<Node> list = new ArrayList<>();
    static int answer = 0;

    static class Node implements Comparable<Node>{
        int a;
        int b;
        int c;

        public Node(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Node o) {
            return this.c-o.c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        dis = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dis[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            Node node = new Node(a, b, c);
            list.add(node);
        }

        Collections.sort(list);

        solution();
        System.out.println(answer);
    }

    private static void solution() {
        for (Node node : list) {
            int a = node.a;
            int b = node.b;
            int fa = find(a);
            int fb = find(b);

            if (fa != fb) {
                dis[fa] = fb;
                answer += node.c;
            }

        }

    }

    public static int find(int a) {
        if (a == dis[a]) return dis[a];
        else return find(dis[a]);
    }
}
