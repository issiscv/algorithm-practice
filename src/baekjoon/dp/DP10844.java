package baekjoon.dp;

import java.util.Scanner;

public class DP10844 {
    static final int MOD = 1000000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int[N+1][10];

        for (int i = 1; i <= 9; i++) {
            arr[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    arr[i][j] = arr[i-1][j+1] % MOD;
                } else if (j == 9) {
                    arr[i][j] = arr[i-1][j-1] % MOD;
                } else {
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % MOD;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += arr[N][i];
        }

        System.out.println(sum % MOD);
    }
}
