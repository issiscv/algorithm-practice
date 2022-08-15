package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2178 {

    private static int n;
    private static int m;

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] arr;
    private static int cnt = 0;

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
        m = scanner.nextInt();

        arr = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String str = scanner.next();
            for (int j = 1; j <= str.length(); j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }

        BFS(1, 1);

        System.out.println(cnt+1);
    }

    private static void BFS(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                int a = poll.x;
                int b = poll.y;

                for (int j = 0; j < 4; j++) {
                    int nx = a + dx[j];
                    int ny = b + dy[j];

                    if (nx == n && ny == m) {
                        cnt++;
                        return;
                    }

                    if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && arr[nx][ny] == 1) {
                        queue.offer(new Node(nx, ny));
                        arr[nx][ny] = 0;
                    }
                }
            }
            cnt++;
        }
    }
}
