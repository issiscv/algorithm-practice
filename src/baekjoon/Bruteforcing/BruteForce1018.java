package baekjoon.Bruteforcing;

import java.util.Scanner;

public class BruteForce1018 {

    static boolean[][] ch;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        ch = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'W') {
                    ch[i][j] = true;
                } else {
                    ch[i][j] = false;
                }
            }
        }
        int row = N - 7;
        int col = M - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);

    }

    private static void find(int x, int y) {

        boolean flag = ch[x][y];
        int count = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {

                if (ch[i][j] != flag) {
                    count++;
                }
                flag = !flag;
            }
            flag = !flag;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }

}
