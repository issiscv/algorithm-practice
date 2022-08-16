package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2146 {

    private static int N;
    private static int tmp;
    private static int[][] arr;
    private static int[][] map;
    private static int color = 2;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

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
        map = new int[N+1][N+1];

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
                    answer = Math.min(answer, bfs);
                }
                map = new int[N+1][N+1];
            }
        }

        System.out.println(answer);
    }

    private static int BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int dis = 0;

        map[node.x][node.y] = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                int x = poll.x;
                int y = poll.y;

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && arr[nx][ny] != tmp && arr[nx][ny] != 0) {
                        return dis;
                    }

                    if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && map[nx][ny] == 0) {
                        queue.offer(new Node(nx, ny));
                        map[nx][ny] = 1;
                    }
                }
            }
            dis++;
        }
        return -1;
    }

    private static void DFS(int x, int y) {
        arr[x][y] = color;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && arr[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }
}
