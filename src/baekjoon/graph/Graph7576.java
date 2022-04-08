package baekjoon.graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph7576 {

    private static Queue<Node> queue = new LinkedList<>();
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] arr;
    private static int[][] ch;
    private static int m;
    private static int n;

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        m = scanner.nextInt();
        n = scanner.nextInt();

        arr = new int[n +1][m +1];
        ch = new int[n +1][m +1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 1) {
                    queue.offer(new Node(i, j));
                }
            }
        }

        BFS();

        int check = check();
        System.out.println(check);

    }

    private static int check() {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (ch[i][j] == 0 && arr[i][j] == 0) {
                    return -1;
                } else {
                    max = Math.max(max, ch[i][j]);
                }
            }
        }
        return max;
    }

    private static void BFS() {

        while (!queue.isEmpty()) {

            for (int i = 0; i < queue.size(); i++) {
                Node tmp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];

                    if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && arr[nx][ny] == 0) {
                        ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                        queue.offer(new Node(nx, ny));
                        arr[nx][ny] = 1;
                    }
                }
            }
        }

    }
}
