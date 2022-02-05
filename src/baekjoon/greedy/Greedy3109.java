package baekjoon.greedy;

import java.util.*;

public class Greedy3109 {

    static char[][] map;
    static int R, C;
    static int[] dx = {-1, 0, 1};
    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        R = scanner.nextInt();
        C = scanner.nextInt();

        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = scanner.next().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            DFS(i, 0);
        }
        System.out.println(answer);
    }

    private static boolean DFS(int i, int j) {
        if (j == C - 1) {
            answer++;
            return true;
        } else {
            for (int k = 0; k < 3; k++) {
                int nx = dx[k] + i;
                int ny = 1 + j;

                if (nx >= 0 && nx < R && ny >= 0 && ny < C && map[nx][ny] != 'x') {
                    map[nx][ny] = 'x';
                    if (DFS(nx, ny)) return true;
                }
            }
        }
        return false;
    }
}