package baekjoon.graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph7576 {

    static int cnt = 0;
    static int b;
    static int a;
    static int[][] arr;
    static Queue<Node> queue = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


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

        a = scanner.nextInt();
        b = scanner.nextInt();

        arr = new int[b+1][a+1];

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 1) {
                    queue.offer(new Node(i, j));
                }
            }
        }

        BFS();

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(cnt-1);
    }

    private static void BFS() {

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                int x = poll.x;
                int y = poll.y;

                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx >= 1 && nx <= b && ny >=1 && ny <= a && arr[nx][ny] == 0) {
                        queue.offer(new Node(nx, ny));
                        arr[nx][ny] = 1;
                    }
                }
            }
            cnt++;
        }
    }
}
