package section8_dfs_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeMaxScore {

    static class Problem {
        int score;
        int time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    static int n,m ;
    static List<Problem> list = new ArrayList<>();
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Problem problem = new Problem(a, b);

            list.add(problem);
        }

        DFS(0, 0, 0);

        System.out.println(max);
    }

    private static void DFS(int v, int score, int time) {
        if (time > m) return;
        if (v == n) {
            if (time <= m) {
                max = Math.max(max, score);
            }
        } else {
            DFS(v+1,score + list.get(v).score, time + list.get(v).time);
            DFS(v+1,score, time);
        }
    }
}
