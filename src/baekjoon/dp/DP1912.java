package baekjoon.dp;

import java.util.Scanner;

public class DP1912 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];
        int max = dp[1];
        for (int i = 2; i <= N; i++) {
            dp[i] = arr[i];
            dp[i] = Math.max(dp[i], dp[i-1] + arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
