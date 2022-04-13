package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer2630 {

    private static int white = 0;
    private static int blue = 0;
    private static int[][] arr;

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

        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int row, int col, int n) {

        if (check(row, col, n)) {
            if (arr[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        if (n == 1) {
            if (arr[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int size = n / 2;

        for (int i = row; i < row + n; i += size) {
            for (int j = col; j < col + n; j += size) {
                divide(i, j, size);
            }
        }
    }

    private static boolean check(int row, int col, int n) {
        int tmp = arr[row][col];

        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (tmp != arr[i][j])
                    return false;
            }
        }
        return true;
    }
}
