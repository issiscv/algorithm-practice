package baekjoon.DP;

import java.util.Scanner;

public class DP9095 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            for (int j = 4; j <= N; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[N]);
        }
    }
}
