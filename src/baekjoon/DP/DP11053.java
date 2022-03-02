package baekjoon.DP;

import java.util.Arrays;
import java.util.Scanner;

public class DP11053 {

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

        for (int i = 1; i <= N; i++) {
            recursive(i);
        }

        int max = -1;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    private static int recursive(int n) {

        if (dp[n] == null) {
            dp[n] = 1;
            for (int i = n-1; i > 0; i--) {
                if (arr[n] > arr[i]) {
                    dp[n] = Math.max(recursive(i) + 1, dp[n]);
                }
            }
        }

        return dp[n];
    }

}
