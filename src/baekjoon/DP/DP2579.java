package baekjoon.DP;

import java.util.Scanner;

public class DP2579 {

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

        int recursive = recursive(N);
        System.out.println(recursive);

    }

    private static int recursive(int i) {

        if (dp[i] == null) {
            dp[i] = Math.max(recursive(i-2), recursive(i-3) + arr[i-1]) + arr[i];
        }
        return dp[i];
    }
}
