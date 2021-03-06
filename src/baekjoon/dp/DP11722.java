package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP11722 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];

        for (int i = N-1; i >= 0; i--) {
            arr[i] = scanner.nextInt();
        }

        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[j], dp[i]);
                }
            }
            dp[i] += 1;
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

}
