package baekjoon.DP;

import java.util.Scanner;

public class DP9461 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] dp = new long[101];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(dp[n]);
        }
    }
}
