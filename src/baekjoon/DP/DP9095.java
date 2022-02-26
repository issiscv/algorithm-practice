package baekjoon.DP;

import java.util.Scanner;

public class DP9095 {

    static int[] dp = new int[11];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < N; i++) {
            int tmp = scanner.nextInt();

            for (int j = 4; j <= tmp; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[tmp]);
        }
    }
}
