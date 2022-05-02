package baekjoon.dp;

import java.util.Scanner;

public class DP2225 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[][] arr = new int[K+1][N+1];

        for (int i = 1; i <= N; i++) {
            arr[1][i] = 1;
        }

        for (int i = 1; i <= K; i++) {
            arr[i][0] = 1;
        }

        for (int i = 2; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % 1000000000;
            }
        }

        System.out.println(arr[K][N]);

    }
    
}
