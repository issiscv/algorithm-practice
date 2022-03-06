package programmers.dynamic_programming;

import java.util.Scanner;

public class StoneStairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] dp = new int[37];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[N+1]);
    }

}
