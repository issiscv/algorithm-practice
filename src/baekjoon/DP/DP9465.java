package baekjoon.DP;

import java.util.Scanner;

public class DP9465 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T  = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int[][] dp = new int[2][n+1];
            int[][] tmp = new int[2][n+1];

            for (int j = 0; j < 2; j++) {
                for (int k = 1; k <= n; k++) {
                    tmp[j][k] = scanner.nextInt();
                }
            }

            dp[0][1] = tmp[0][1];
            dp[1][1] = tmp[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = tmp[0][j] + Math.max(dp[1][j-1], dp[1][j-2]);
                dp[1][j] = tmp[1][j] + Math.max(dp[0][j-1], dp[0][j-2]);
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
