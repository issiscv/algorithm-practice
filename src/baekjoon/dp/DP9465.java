package baekjoon.dp;

import java.util.Scanner;

public class DP9465 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[][] arr = new int[3][N+1];

            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            int[][] dp = new int[3][N+1];

            dp[1][1] = arr[1][1];
            dp[2][1] = arr[2][1];

            for (int i = 2; i <= N; i++) {
                dp[1][i] = Math.max(dp[2][i-1], dp[2][i-2]) + arr[1][i];
                dp[2][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[2][i];
            }

            System.out.println(Math.max(dp[1][N], dp[2][N]));

        }
    }
}
