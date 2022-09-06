package programmers.level_2;

import java.util.*;

public class Lv2빛의_경로_사이클 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int R, C;
    private static boolean[][][] visited;

    public static int[] solution(String[] grid) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int r = R = grid.length;
        int c = C = grid[0].length();

        visited = new boolean[r][c][4];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int d = 0; d < 4; d++) {
                    if (!visited[i][j][d]) {
                        int light = light(grid, i, j, d);
                        list.add(light);
                    }
                }
            }
        }

        return list.stream().sorted().mapToInt(i->i).toArray();
    }

    private static int light(String[] grid, int r, int c, int d) {
        int cnt = 0;
        while (true) {
            if (visited[r][c][d]) break;

            cnt++;
            visited[r][c][d] = true;


            //방향 틀어주기
            if (grid[r].charAt(c) == 'L') {
                d = d == 0 ? 3 : d - 1;
            } else if (grid[r].charAt(c) == 'R') {
                d = d == 3 ? 0 : d + 1;
            }

            r = (r + dx[d] + R) % R;
            c = (c + dy[d] + C) % C;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"SL", "LR"});
        for (int i : solution) {
            System.out.println(i);
        }
    }

}
