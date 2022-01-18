package basic_algorithm.section8_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElevenMageBFS {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr = new int[8][8];
    static int min = Integer.MAX_VALUE;

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

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        arr[1][1] = 1;
        BFS(1, 1);
        System.out.println(min);
    }

    private static void BFS(int i, int j) {
        Node root = new Node(i, j);
        Queue<Node> queue = new LinkedList<>();
        int L = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Node tmp = queue.poll();
                if (tmp.x == 7 && tmp.y == 7) {
                    min = Math.min(min, L);
                }

                for (int l = 0; l < 4; l++) {
                    int nx = dx[l] + tmp.x;
                    int ny = dy[l] + tmp.y;
                    if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.offer(new Node(nx, ny));
                    }
                }
            }
            L++;
        }
    }

}
