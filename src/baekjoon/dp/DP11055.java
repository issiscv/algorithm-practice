package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP11055 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }

        dp[1] = arr[1];

        for (int i=2; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            dp[i] = Math.max(dp[i], arr[i]);
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
