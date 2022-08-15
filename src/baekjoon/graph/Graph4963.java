package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph4963 {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] arr;
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if (a == 0 && b == 0) {
                return;
            }

            arr = new int[b+1][a+1];

            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= a; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }


            int cnt = 0;
            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= a; j++) {
                    if (arr[i][j] == 1) {
                        DFS(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void DFS(int x, int y) {
        arr[x][y] = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 1 && nx <= b && ny >= 1 && ny <= a && arr[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }

    }
}
