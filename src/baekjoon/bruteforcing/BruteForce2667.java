package baekjoon.bruteforcing;

import java.util.*;

public class BruteForce2667 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int number = 1;
    private static int[][] arr;
    private static int[][] map;
    private static int n;
    private static int tmp;
    private static int max;

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
        map = new int[n +1][n +1];

        for (int i = 1; i <= n; i++) {
            String str = scanner.next();
            for (int j = 1; j <= n; j++) {
                arr[i][j] = str.charAt(j-1) - '0';
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1 && map[i][j] == 0) {
                    DFS(i, j);
                    number++;
                }
            }
        }
        tmp = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j] != 0 && map[i][j] != -1) {
                    tmp = map[i][j];
                    max = 1;
                    BFS(new Node(i, j));
                    list.add(max);
                }
            }
        }

        Collections.sort(list);

        System.out.println(number-1);
        for (Integer t : list) {
            System.out.println(t);
        }

    }

    private static void BFS(Node node) {

        map[node.x][node.y] = -1;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node poll = queue.poll();
                int x = poll.x;
                int y = poll.y;

                for (int k = 0; k < 4; k++) {
                    int nx = dx[k] + x;
                    int ny = dy[k] + y;

                    if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && map[nx][ny] == tmp && map[nx][ny] != -1) {
                        queue.offer(new Node(nx, ny));
                        map[nx][ny] = -1;
                        max++;
                    }
                }
            }
        }
    }

    private static void DFS(int i, int j) {

        map[i][j] = number;

        for (int k = 0; k < 4; k++) {
            int nx = dx[k] + i;
            int ny = dy[k] + j;

            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && arr[nx][ny] == 1 && map[nx][ny] == 0) {
                DFS(nx, ny);
            }
        }
    }
}
