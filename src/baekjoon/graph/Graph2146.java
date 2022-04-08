package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2146 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    private static int n;
    private static int[][] arr;
    private static int[][] ch;

    private static int color = 2;
    private static int ownColor;
    private static int result = Integer.MAX_VALUE;

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

        n = scanner.nextInt();
        arr = new int[n +1][n +1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1) {
                    DFS(new Node(i, j));
                    color++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] != 0) {
                    ch = new int[n +1][n +1];
                    ownColor = arr[i][j];
                    BFS(new Node(i, j));
                }
            }
        }

        System.out.println(result);
    }

    private static void BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && ch[nx][ny] == 0) {
                    if (arr[nx][ny] != ownColor && arr[nx][ny] != 0)  {
                        result = Math.min(result, ch[tmp.x][tmp.y]);
                        return;
                    }
                    queue.offer(new Node(nx, ny));
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                }
            }

        }

    }

    private static void DFS(Node tmp) {
        arr[tmp.x][tmp.y] = color;
        for (int i = 0; i < 4; i++) {
            int nx = tmp.x + dx[i];
            int ny = tmp.y + dy[i];

            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && arr[nx][ny] == 1) {
                DFS(new Node(nx, ny));
            }
        }
    }
}
