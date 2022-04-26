package baekjoon.bruteforcing;

import java.util.Scanner;

public class BruteForce2580 {

    private static int[][] map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        map = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        DFS(0, 0);

    }

    private static void DFS(int row, int col) {

        if (col == 9) {
            DFS(row + 1, 0);
            return;
        }

        if (row == 9) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(map[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
            System.exit(0);
        }

        if (map[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(row, col, i)) {
                    map[row][col] = i;
                    DFS(row, col + 1);
                }
            }
            map[row][col] = 0;
            return;
        }

        DFS(row, col + 1);
    }

    private static boolean check(int row, int col, int value) {

        for (int i = 0; i < 9; i++) {
            if (map[row][i] == value)
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (map[i][col] == value)
                return false;
        }

        int a = (row / 3) * 3;
        int b = (col / 3) * 3;

        for (int i = a; i < a+3; i++) {
            for (int j = b; j < b+3; j++) {
                if (map[i][j] == value) return false;
            }
        }

        return true;
    }
}
