package programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2게임_맵_최단거리 {

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] arr;
    private static int[][] visited;
    private static int n;
    private static int m;

    public static int solution(int[][] maps) {
        int answer = 0;

        n = maps.length;
        m = maps[0].length;
        visited = new int[n][m];

        arr = maps;

        BFS(0, 0);

        answer = visited[n-1][m-1];

        return answer == 0 ? -1 : answer;
    }

    private static void BFS(int x, int y) {
        visited[x][y] = 1;

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        while (!queue.isEmpty()) {
            Point poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == 0) {
                    if (arr[nx][ny] == 1) {
                        queue.offer(new Point(nx, ny));
                        visited[nx][ny] = visited[poll.x][poll.y] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] map = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };
        solution(map);
    }

}
