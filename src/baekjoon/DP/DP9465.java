package baekjoon.DP;

import java.util.Scanner;

public class DP9465 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[][] dp = new int[3][N+1];

            int[][] arr = new int[3][N+1];

            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= N; k++) {
                    arr[j][k] = scanner.nextInt();
                }
            }

            dp[1][1] = arr[1][1];
            dp[2][1] = arr[2][1];

            for (int j = 2; j <= N; j++) {
                dp[1][j] = Math.max(dp[2][j-1], dp[2][j-2]) + arr[1][j];
                dp[2][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[2][j];
            }
            System.out.println(Math.max(dp[1][N], dp[2][N]));
        }
    }
}
