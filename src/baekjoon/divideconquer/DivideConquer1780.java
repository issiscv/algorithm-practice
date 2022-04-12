package baekjoon.divideconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DivideConquer1780 {

    private static int[][] arr;
    private static int A;
    private static int B;
    private static int C;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        divide(0, 0, N);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    private static void divide(int row, int col, int n) {

        if (check(row, col, n)) {
            if (arr[row][col] == -1) {
                A++;
            } else if (arr[row][col] == 0) {
                B++;
            } else {
                C++;
            }
        } else {
            int size = n / 3;

            for (int i = row; i < row +  n; i += size) {
                for (int j = col; j < col + n; j += size) {
                    divide(i, j, size);
                }
            }
        }
    }

    private static boolean check(int row, int col, int n) {
        int tmp = arr[row][col];

        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (tmp != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
