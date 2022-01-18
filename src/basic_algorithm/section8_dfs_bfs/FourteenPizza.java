package basic_algorithm.section8_dfs_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourteenPizza {

    static int n, m;
    static int[] combi;
    static List<Point> pz = new ArrayList<>();
    static List<Point> hs = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = scanner.nextInt();

                if (tmp == 1) hs.add(new Point(i, j));
                if (tmp == 2) pz.add(new Point(i, j));
            }
        }
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }

    private static void DFS(int v, int s) {
        if (v == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(sum, answer);
        } else {
            for (int i = s; i < pz.size(); i++) {
                combi[v] = i;
                DFS(v+1, i+1);
            }
        }
    }
}
