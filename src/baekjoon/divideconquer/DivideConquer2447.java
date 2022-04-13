package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer2447 {

    private static char[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        divide(0, 0, N);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void divide(int row, int col, int n) {
        if (n == 3) {

            for (int i = col; i < col + 3; i++) {
                arr[row][i] = '*';
            }

            arr[row+1][col] = '*';
            arr[row+1][col+2] = '*';

            for (int i = col; i < col + 3; i++) {
                arr[row+2][i] = '*';
            }

            return;
        }

        int size = n / 3;

        divide(row, col, size);
        divide(row, col + size, size);
        divide(row, col + size * 2, size);

        divide(row + size, col, size);
        divide(row + size, col + size * 2, size);

        divide(row + size * 2, col, size);
        divide(row + size * 2, col + size, size);
        divide(row + size * 2, col + size * 2, size);
    }

}
