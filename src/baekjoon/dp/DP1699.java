package baekjoon.dp;

import java.util.Scanner;

public class DP1699 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] dp = new int[N+1];

        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
            }
        }

        System.out.println(dp[N]);
    }
}
