package baekjoon.DP;

import java.util.Scanner;

public class DP11057 {

    static final int MOD = 10007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] dp = new int[N+1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += (dp[i-1][k] % MOD);
                }
            }
        }

        int sum = 0;
        for (int j = 0; j < 10; j++) {
            System.out.println(dp[N][j]);
            sum += dp[N][j];
        }
        System.out.println(sum % MOD);
    }
}
