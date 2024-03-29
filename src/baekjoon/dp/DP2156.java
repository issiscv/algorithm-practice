package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP2156 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] dp = new int[N+1];
        dp[1] = arr[1];

        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(arr[i] + arr[i-1] + dp[i-3], arr[i] + dp[i-2]);
            dp[i] = Math.max(dp[i], dp[i-1]);
        }

        System.out.println(dp[N]);

    }
}
