package section8_dfs_bfs;

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

    static int n, time;
    static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        time = scanner.nextInt();

        Problem[] problems = new Problem[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();//점수
            int b = scanner.nextInt();//시간

            Problem problem = new Problem(a, b);
            problems[i] = problem;
        }

        solution(0, 0, 0, problems);
        System.out.println(score);
    }

    private static void solution(int s, int t, int l, Problem[] problems) {

        if (t > time) return;
        if (l == n) {
            score = Math.max(score, s);
        }
        else {
            solution(s + problems[l].score, t + problems[l].time, l+1, problems);
            solution(s, t, l+1, problems);
        }

    }
}
