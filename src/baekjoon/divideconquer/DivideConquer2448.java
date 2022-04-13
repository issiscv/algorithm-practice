package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer2448 {

    private static char[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        arr = new char[N][2 * N - 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                arr[i][j] = ' ';
            }
        }

        divide(0, N-1, N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void divide(int row, int col, int n) {

        if (n == 3) {
            arr[row][col] = '*';

            arr[row+1][col-1] = arr[row+1][col+1] = '*';

            arr[row+2][col-2] = arr[row+2][col-1] = arr[row+2][col] = arr[row+2][col+1] = arr[row+2][col+2] = '*';

            return;
        }

        int size = n / 2;

        divide(row, col, size);
        divide(row + size, col - size, size);
        divide(row + size, col + size, size);

    }
}
