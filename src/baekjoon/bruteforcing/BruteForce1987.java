package baekjoon.bruteforcing;

import java.util.HashSet;
import java.util.Scanner;

public class BruteForce1987 {

    private static int R;
    private static int C;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static char[][] arr;
    private static HashSet<Character> set;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        R = scanner.nextInt();
        C = scanner.nextInt();

        arr = new char[R + 1][C + 1];

        for (int i = 1; i <= R; i++) {
            String str = scanner.next();
            for (int j = 1; j <= C; j++) {
                arr[i][j] = str.charAt(j - 1);
            }
        }
        set = new HashSet<>();
        DFS(1, 1, 0);

        System.out.println(max);
    }

    private static int max = Integer.MIN_VALUE;

    private static void DFS(int i, int j, int count) {

        if (set.contains(arr[i][j])) {
            max = Math.max(max, count);
        } else {
            for (int k = 0; k < 4; k++) {
                int nx = i + dx[k];
                int ny = j + dy[k];

                if (nx >= 1 && nx <= R && ny >= 1 && ny <= C) {
                    set.add(arr[i][j]);
                    DFS(nx, ny, count + 1);
                    set.remove(arr[i][j]);
                }
            }
        }

    }
}
