package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer2447 {

    private static StringBuilder sb = new StringBuilder();
    private static char[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        arr = new char[N][N];

        star(0, 0, N, false);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void star(int row, int col, int n, boolean check) {
        if (check) {
            for (int i = row; i < row + n; i++) {
                for (int j = col; j < col + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[row][col] = '*';
            return;
        }

        int size = n / 3;
        int count = 0;

        for (int i = row; i < row + n; i += size) {
            for (int j = col; j <col + n; j += size) {
                count++;
                if (count == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }

    }
}
