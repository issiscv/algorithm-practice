package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce2580 {

    private static int[][] arr;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        divide(0, 0);
    }

    private static void divide(int row, int col) {

        if (col == 9) {
            divide(row+1, 0);
            return;
        }

        if (row == 9) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
            System.exit(0);
        }

        if (arr[row][col] == 0) {
            for (int i = 0; i <= 9; i++) {
                if (check(row, col, i)) {
                    arr[row][col] = i;
                    divide(row, col + 1);
                }
            }

            arr[row][col] = 0;
            return;
        }

        divide(row, col+1);
    }

    private static boolean check(int row, int col, int value) {

        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value)
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value)
                return false;
        }

        int a = (row / 3) * 3;
        int b = (col / 3) * 3;

        for (int i = a; i < a+3; i++) {
            for (int j = b; j < b+3; j++) {
                if (arr[i][j] == value) return false;
            }
        }

        return true;
    }

}
