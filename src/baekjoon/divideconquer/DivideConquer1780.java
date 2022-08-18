package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer1780 {

    private static int[][] arr;
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        arr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        divide(1, 1, N);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void divide(int row, int col, int n) {

        if (check(row, col, n)) {
            if (arr[row][col] == -1) {
                a++;
            } else if (arr[row][col] == 0) {
                b++;
            } else {
                c++;
            }
        } else {
            int size = n / 3;

            for (int i = row; i < row + n; i += size) {
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
                if (arr[i][j] != tmp) {
                    return false;
                }
            }
        }

        return true;
    }
}
