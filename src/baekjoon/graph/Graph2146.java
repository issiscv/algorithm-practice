package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2146 {

    static int[][] arr;
    static boolean[][] visited;
    static int N;
    static int color = 2;
    static int tmp = 2;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int min = Integer.MAX_VALUE;

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

        N = scanner.nextInt();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 1) {
                    DFS(i, j);
                    color++;
                }
            }
        }
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] != 0) {
                    tmp = arr[i][j];
                    int bfs = BFS(new Node(i, j));
                    visited = new boolean[N+1][N+1];
                    answer = Math.min(answer, bfs);
                }
            }
        }
        System.out.println(answer);
    }

    private static int BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int dis = 0;

        visited[node.x][node.y] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node p = queue.poll();
                int x = p.x;
                int y = p.y;

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && arr[nx][ny] != tmp && arr[nx][ny] != 0) {
                        return dis;
                    }

                    if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && !visited[nx][ny]) {
                            queue.offer(new Node(nx, ny));
                            visited[nx][ny] = true;
                    }
                }
            }
            dis++;
        }

        return 0;
    }

    private static void DFS(int i, int j) {

        arr[i][j] = color;

        for (int k = 0; k < 4; k++) {
            int nx = dx[k] + i;
            int ny = dy[k] + j;

            if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && arr[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }
}
