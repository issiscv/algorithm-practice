package baekjoon.divideconquer;

import java.util.Scanner;

public class DivideConquer1992 {

    private static int[][] map;
    private static StringBuilder sb;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        map = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            String str = scanner.next();
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }

        sb = new StringBuilder();

        divide(1, 1, N);

        System.out.println(sb.toString());
    }

    private static void divide(int row, int col, int n) {

        if (check(row, col, n)) {
            sb.append(map[row][col]);
        } else {

            int size = n / 2;
            sb.append("(");

            for (int i = row; i < row + n; i += size) {
                for (int j = col; j < col + n; j += size) {
                    divide(i, j, size);
                }
            }
            sb.append(")");
        }

    }

    private static boolean check(int row, int col, int n) {
        int tmp = map[row][col];

        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (map[i][j] != tmp) {
                    return false;
                }
            }
        }

        return true;
    }
}
