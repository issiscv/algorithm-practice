package baekjoon.dp;

import java.util.Scanner;

public class DP11052 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + arr[j]);
            }
        }
        System.out.println(dp[N]);
    }
}
