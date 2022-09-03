package programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2카카오프렌즈_컬러링북 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static boolean[][] visited;
    private static int M;
    private static int N;

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        visited = new boolean[m][n];
        M = m;
        N = n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    int bfs = BFS(i, j, picture);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, bfs);
                    numberOfArea++;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    private static int BFS(int i, int j, int[][] picture) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(i, j));

        int color = picture[i][j];
        visited[i][j] = true;
        int count = 1;
        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = poll.x + dx[k];
                int ny = poll.y + dy[k];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if (picture[nx][ny] == color && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new Node(nx, ny));
                        count++;
                    }
                }

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int m = 6;
        int n = 4;

        int[][] picture = {
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}
        };

        solution(m, n, picture);
    }

}
