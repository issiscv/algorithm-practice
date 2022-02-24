package baekjoon.DP;

import java.util.Scanner;

public class DP1463 {

    static Integer[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        dp = new Integer[N+1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(N));

    }

    private static int recur(int n) {

        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(recur(n / 3), Math.min(recur(n / 2), recur(n-1))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recur(n / 3), recur(n-1)) + 1;
            } else if (n % 2 == 0){
                dp[n] = Math.min(recur(n / 2), recur(n-1)) + 1;

            } else {
                dp[n] = recur(n-1) + 1;
            }
        }
        return dp[n];
    }

}
