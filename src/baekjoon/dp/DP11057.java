package baekjoon.dp;

import java.util.Scanner;

public class DP11057 {

    static final int MOD = 10007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int[N+1][10];
        for (int i = 0; i <= 9; i++) {
            arr[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    arr[i][j] += (arr[i-1][k] % MOD);
                }
            }
        }

        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += arr[N][i] % MOD;
        }

        System.out.println(sum);
    }
}
