package programmers.level_2;

public class Lv2프렌즈4블록 {

    private static int row;
    private static int col;
    private static char[][] map;

    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        row = m;
        col = n;
        map = new char[m][n];

        for (int i = 0; i < m; i++) {
            String s = board[i];
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        while (true) {
            int count = checkBlock();
            if (count == 0) break;
            answer += count;
            dropBlock();
        }

        return answer;
    }

    private static void dropBlock() {

        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (map[j][i] == '.') {
                    for (int k = j; k >= 1; k--) {
                        map[k][i] = map[k-1][i];
                        map[k-1][i] = '.';
                    }
                }
            }
        }

    }

    private static int checkBlock() {
        int cnt = 0;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (map[i][j] == '.') continue;
                checkFour(visited, i, j);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j]) {
                    map[i][j] = '.';
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void checkFour(boolean[][] visited, int r, int c) {
        char tmp = map[r][c];

        for (int i = r; i < r + 2; i++) {
            for (int j = c; j < c + 2; j++) {
                if (map[i][j] != tmp) return;
            }
        }

        for (int i = r; i < r + 2; i++) {
            for (int j = c; j < c + 2; j++) {
                visited[i][j] = true;
            }
        }

    }

    public static void main(String[] args) {
        String[] board = {
                "CCBDE",
                "AAADE",
                "AAABF",
                "CCBBF"};
        solution(4, 5, board);
    }

}

