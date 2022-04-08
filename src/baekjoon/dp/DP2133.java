package baekjoon.dp;

import java.util.Scanner;

public class DP2133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] dp = new int[N+1];

        dp[0] = 1;
        dp[1] = 0;
        if (N >= 2)
            dp[2] = 3;

        for (int i = 4; i <= N; i+=2) {
            dp[i] = dp[i-2] * 3;
            for (int j = 0; j < i-2; j+=2) {
                dp[i] = dp[i] + dp[j] * 2;
            }
        }

        System.out.println(dp[N]);
    }
}
