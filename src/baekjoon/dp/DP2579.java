package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP2579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[10001];
        int[] dp = new int[10001];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-2] + arr[i-1]);
        }
        System.out.println(dp[N]);

    }
}
