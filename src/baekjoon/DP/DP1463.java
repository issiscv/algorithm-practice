package baekjoon.DP;

import java.util.Scanner;

public class DP1463 {

    static Integer[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        dp = new Integer[n+1];
        dp[0] = 0;
        dp[1] = 0;

        int recursive = recur(n);
        System.out.println(recursive);
    }

    private static int recur(int N) {

        if (dp[N] == null) {
            // 6으로 나눠지는 경우
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }
            // 3으로만 나눠지는 경우
            else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }
            // 2로만 나눠지는 경우
            else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[N] = recur(N - 1) + 1;
            }
        }

        return dp[N];
    }
}
