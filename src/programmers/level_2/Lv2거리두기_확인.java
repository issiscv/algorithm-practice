package programmers.level_2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lv2거리두기_확인 {

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static char[][] arr;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, 1};

    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            String[] tmp = places[i];
            arr = new char[5][5];

            for (int j = 0; j < 5; j++) {
                String s = tmp[j];
                for (int k = 0; k < 5; k++) {
                    arr[j][k] = s.charAt(k);
                }
            }

            if (check()) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }

        return answer;
    }

    private static boolean check() {
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (arr[j][k] == 'P') {
                    boolean ch = BFS(new Point(j, k));
                    if (!ch) return false;
                }
            }
        }

        return true;
    }

    public static boolean BFS(Point point) {
        Queue<Point> q = new LinkedList<>();
        q.offer(point);
        boolean[][] visited = new boolean[5][5];
        visited[point.x][point.y] = true;

        while(!q.isEmpty()) {
            Point current = q.poll();

            for(int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                int manhattan = Math.abs(point.x - nx) + Math.abs(point.y - ny);

                if(nx >= 0 && ny >= 0 && nx < 5 && ny < 5)  {
                    if (!visited[nx][ny] && manhattan <= 2) {
                        visited[nx][ny] = true;

                        if (arr[nx][ny] == 'P') {
                            return false;
                        }

                        if (arr[nx][ny] == 'O')
                            q.offer(new Point(nx, ny));

                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };



        solution(places);
    }
}
