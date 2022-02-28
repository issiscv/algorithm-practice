package baekjoon.DP;

import java.util.Scanner;

public class DP1003 {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
        dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
        dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
        dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수

        int T = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            fibonacci(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);

        }
        System.out.print(sb);
    }

    private static Integer[] fibonacci(int n) {

        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }

        return dp[n];
    }
}
