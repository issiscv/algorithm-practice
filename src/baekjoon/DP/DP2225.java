package baekjoon.DP;

import java.util.Scanner;

public class DP2225 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[][] dp = new int[N+1][K+1];

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= K; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
            }
        }

        System.out.println(dp[N][K]);
    }

}
