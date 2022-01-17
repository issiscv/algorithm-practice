package section8_dfs_bfs;

import java.util.Scanner;

public class TenMazeDFS {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr = new int[8][8];
    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        arr[1][1] = 1;
        DFS(1, 1);
        System.out.println(answer);
    }

    private static void DFS(int i, int j) {
        if (i == 7 && j == 7) {
            answer++;
        } else {
            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + i;
                int ny = dy[k] + j;
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    DFS(nx, ny);
                    arr[nx][ny] = 0;
                }
            }
        }
    }
}
