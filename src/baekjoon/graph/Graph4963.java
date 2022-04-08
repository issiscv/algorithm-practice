package baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph4963 {

    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int[][] arr;
    private static int w;
    private static int h;
    private static int cnt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            w = scanner.nextInt();
            h = scanner.nextInt();

            if (w == 0 && h == 0) {
                break;
            }

            arr = new int[h + 1][w + 1];
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            cnt = 0;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (arr[i][j] == 1) {
                        DFS(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }

    private static void DFS(int i, int j) {

        for (int k = 0; k < 8; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 1 && nx <= h && ny >=1 && ny <= w && arr[nx][ny] == 1) {
                arr[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }
}
