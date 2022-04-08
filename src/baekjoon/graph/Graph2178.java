package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2178 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
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

        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n +1][m +1];
        ch = new int[n +1][m +1];

        for (int i = 1; i <= n; i++) {
            String str = scanner.next();
            for (int j = 1; j <= str.length(); j++) {
                arr[i][j] = str.charAt(j-1) - '0';
            }
        }

        BFS();
        System.out.println(ch[n][m] + 1);
    }

    private static void BFS() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(1, 1));
        arr[1][1] = 0;
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx == n && ny == m) {
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                    return;
                }

                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && arr[nx][ny] == 1) {
                    queue.offer(new Node(nx, ny));
                    ch[nx][ny] = ch[tmp.x][tmp.y] + 1;
                    arr[nx][ny] = 0;
                }
            }
        }
    }
}
