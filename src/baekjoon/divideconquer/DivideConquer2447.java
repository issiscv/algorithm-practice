package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer2447 {

    private static char[][] map;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        map = new char[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] = ' ';
            }
        }

        divide(1, 1, N);


        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void divide(int row, int col, int n) {

        if (n == 3) {
            map[row][col] = map[row][col+1] = map[row][col+2] = '*';
            map[row+1][col] = map[row+1][col+2] = '*';
            map[row+2][col] = map[row+2][col+1] = map[row+2][col+2] = '*';
            return;
        }

        int size = n / 3;

        divide(row, col, size);
        divide(row, col + size, size);
        divide(row, col + size + size, size);
        divide(row + size, col, size);
        divide(row + size, col + size + size, size);
        divide(row + size + size, col, size);
        divide(row + size + size, col + size, size);
        divide(row + size + size, col + size + size, size);
    }
}
