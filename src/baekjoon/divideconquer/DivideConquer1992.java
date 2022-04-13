package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer1992 {

    private static int[][] arr;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        divide(0, 0, N);
        System.out.println(sb.toString());
    }

    private static void divide(int row, int col, int n) {
        if (check(row, col, n)) {
            sb.append(arr[row][col]);
            return;
        }

        if (n == 1) {
            return;
        }

        int size = n / 2;
        sb.append("(");

        for (int i = row; i < row + n; i += size) {
            for (int j = col; j < col + n; j += size) {
                divide(i, j, size);
            }
        }

        sb.append(")");
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
