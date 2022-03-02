package baekjoon.DP;

import java.util.Scanner;

public class DP10844Recursive {

    static Integer[][] dp;
    final static long MOD = 1000000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        dp = new Integer[N+1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 0; i < 10; i++) {
            recursive(N, i);
        }
        long result = 0;
        for(int i = 1; i <= 9; i++) {
            result += recursive(N, i);
        }
        System.out.println(result % MOD);
    }

    private static int recursive(int digit, int value) {

        if(digit == 1) {
            return dp[digit][value];
        }

        if (dp[digit][value] == null) {
            if (value == 0) {
                dp[digit][value] = recursive(digit-1, 1);
            } else if (value == 9) {
                dp[digit][value] = recursive(digit-1, 8);
            } else {
                dp[digit][value] = (recursive(digit-1, value-1) + recursive(digit-1, value+1));
            }
        }

        return dp[digit][value];
    }
}
