package basic_algorithm.section8_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TwelveTomato {

    static int n, m;
    static int[][] arr;
    static int[][] vi;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Node> queue = new LinkedList<>();
    static int answer = 0;
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();//6
        m = scanner.nextInt();//4
        arr = new int[m+1][n+1];
        vi = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 1) {
                    queue.offer(new Node(i, j));
                }
            }
        }

        BFS();
        check();
        System.out.println(answer);
    }

    private static void check() {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (vi[i][j] == 0 && arr[i][j] == 0) {
                    answer = -1;
                    return;
                } else {
                    answer = Math.max(answer, vi[i][j]);
                }
            }
        }
    }


    private static void BFS() {
        int L = 1;
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node tmp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 1 && nx <= m && ny >= 1 && ny <= n && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        vi[nx][ny] = vi[tmp.x][tmp.y] + 1;
                        queue.offer(new Node(nx, ny));
                    }
                }
            }
        }
    }
}
