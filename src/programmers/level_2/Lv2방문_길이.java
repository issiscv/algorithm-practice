package programmers.level_2;

public class Lv2방문_길이 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static int solution(String dirs) {
        int answer = 0;

        boolean[][][][] visited = new boolean[11][11][11][11];

        int x = 0;
        int y = 0;

        int nextX = 5;
        int nextY = 5;

        for (char c : dirs.toCharArray()) {
            int tmp = 0;

            x = nextX;
            y = nextY;

            if (c == 'U') {
                tmp = 0;
            } else if (c == 'R') {
                tmp = 1;
            } else if (c == 'D') {
                tmp = 2;
            } else {
                tmp = 3;
            }

            nextX += dx[tmp];
            nextY += dy[tmp];

            if (!(nextX >= 0 && nextX <= 10 && nextY >= 0 && nextY <= 10)) {
                nextX -= dx[tmp];
                nextY -= dy[tmp];
                continue;
            }

            if (!visited[x][y][nextX][nextY] && !visited[nextX][nextY][x][y]) {
                visited[x][y][nextX][nextY] = true;
                visited[nextX][nextY][x][y] = true;
                answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String dir = "ULURRDLLU";
        solution(dir);
    }

}
