package baekjoon.DP;

import java.util.Scanner;

public class DP2011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(0) == '0') {
            System.out.println("0");
            return;
        }
        int N = s.length();
        char[] c = new char[N+1];

        for (int i = 1; i <= N; i++) {
            c[i] = s.charAt(i-1);
        }

        int[] dp = new int[N+1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            int tmp = c[i] - '0';

            if (tmp >= 1 && tmp <= 9) {
                dp[i] = dp[i-1];
                dp[i] = dp[i] % 1000000;
            }

            tmp = ((c[i-1] - '0' ) * 10) + tmp;

            if (tmp >= 10 && tmp <= 26) {
                dp[i] += dp[i-2];
                dp[i] = dp[i] % 1000000;
            }
        }

        System.out.println(dp[N]);
    }
}
