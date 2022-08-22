package baekjoon.bruteforcing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BruteForce1987 {


    private static int r;
    private static int c;
    private static char[][] arr;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static Set<Character> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        c = scanner.nextInt();

        arr = new char[r +1][c +1];

        for (int i = 1; i <= r; i++) {
            String str = scanner.next();
            for (int j = 1; j <= c; j++) {
                arr[i][j] = str.charAt(j-1);
            }
        }

        DFS(1, 1, 0);

        System.out.println(max);
    }

    private static int max = Integer.MIN_VALUE;

    private static void DFS(int i, int j, int dis) {

        if (set.contains(arr[i][j])) {
            max = Math.max(max, dis);
        } else {
            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + i;
                int ny = dy[k] + j;

                if (nx >= 1 && nx <= r && ny >= 1 && ny <= c) {
                    set.add(arr[i][j]);
                    DFS(nx, ny, dis+1);
                    set.remove(arr[i][j]);
                }
            }
        }
    }
}
