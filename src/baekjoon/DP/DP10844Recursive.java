package baekjoon.DP;

import java.util.Scanner;

public class DP10844Recursive {

    static Long[][] dp;
    static final int MOD = 1000000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        dp = new Long[N+1][10];

        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1L;
        }

        long sum = 0;
        for (int i = 1; i <= 9; i++) {
            long recur = recur(N, i);
            System.out.println(recur);
            sum += recur;
        }

        System.out.println(sum);
    }

    private static long recur(int digit, int value) {

        if (digit == 1) {
            return dp[digit][value];
        }

        if (dp[digit][value] == null) {
            if (value == 0) {
                dp[digit][value] = recur(digit - 1, 1);
            } else if (value == 9) {
                dp[digit][value] = recur(digit - 1, 8);
            } else {
                dp[digit][value] = recur(digit - 1, value - 1) + recur(digit - 1, value + 1);
            }
        }

        return dp[digit][value] % MOD;
    }
}
