package baekjoon.DP;

import java.util.Scanner;

public class DP1149 {

    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;
    static int[][] arr;
    static Integer[][] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        arr = new int[N][3];
        dp = new Integer[N][3];

        for (int i = 0; i < N; i++) {
            arr[i][RED] = scanner.nextInt();
            arr[i][GREEN] = scanner.nextInt();
            arr[i][BLUE] = scanner.nextInt();
        }

        dp[0][RED] = arr[0][RED];
        dp[0][GREEN] = arr[0][GREEN];
        dp[0][BLUE] = arr[0][BLUE];

        int red = recursive(N-1, RED);
        int green = recursive(N-1, GREEN);
        int blue = recursive(N-1, BLUE);

        System.out.println(Math.min(red, Math.min(green, blue)));
    }

    private static int recursive(int n, int color) {

        if (dp[n][color] == null) {
            if (color == RED) {
                dp[n][color] = Math.min(recursive(n-1, GREEN), recursive(n-1, BLUE)) + arr[n][RED];
            } else if (color == GREEN) {
                dp[n][color] = Math.min(recursive(n-1, RED), recursive(n-1, BLUE)) + arr[n][GREEN];
            } else {
                dp[n][color] = Math.min(recursive(n-1, RED), recursive(n-1, GREEN)) + arr[n][BLUE];
            }
        }

        return dp[n][color];
    }
}
