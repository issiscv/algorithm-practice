package basic_algorithm.section8_dfs_bfs;

import java.util.Scanner;

public class ThirteenIsland {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n;
    static int[][] arr;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1) {
                    DFS(i, j);
                    arr[i][j] = 0;
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    private static void DFS(int i, int j) {

        for (int k = 0; k < 8; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && arr[nx][ny] == 1) {
                arr[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }
}
