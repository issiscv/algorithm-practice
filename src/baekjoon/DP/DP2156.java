package baekjoon.DP;

import java.util.Scanner;

public class DP2156 {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        arr = new int[N+1];
        dp = new Integer[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[0] = 0;
        dp[1] = arr[1];

        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        recursive(N);

        System.out.println(dp[N]);
    }

    private static int recursive(int N) {

        if (dp[N] == null) {
            dp[N] = Math.max(
                        Math.max(recursive(N - 2), recursive(N - 3) + arr[N - 1])
                                + arr[N], recursive(N - 1)
            );
        }
        return dp[N];
    }
}
