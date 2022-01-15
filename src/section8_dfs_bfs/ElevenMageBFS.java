package section8_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElevenMageBFS {

    static int[][] arr = new int[8][8];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int min = Integer.MAX_VALUE;
    static boolean flag =false;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 ; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        arr[1][1]=1;

        BFS(1, 1);
        if (flag)
            System.out.println(min);
        else System.out.println(-1);
    }

    private static void BFS(int i ,int j) {
        Queue<Point> queue = new LinkedList<>();
        int L = 0;
        queue.offer(new Point(i, j));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Point tmp = queue.poll();
                if (tmp.x == 7 && tmp.y == 7) {
                    min = Math.min(min, L);
                    flag = true;
                }
                for (int l = 0; l < 4; l++) {
                    int nx = tmp.x + dx[l];
                    int ny = tmp.y + dy[l];
                    if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }
    }
}
