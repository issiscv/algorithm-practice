package programmers.level_2;

public class Lv2프렌즈4블록 {

    private static int row;
    private static int col;
    private static char[][] map;
    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        row = m;
        col = n;
        map = new char[row][col];

        for (int i = 0; i < row; i++) {
            String s = board[i];
            for (int j = 0; j < col; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        while (true) {

            int cnt = checkBlock();
            if (cnt == 0) break;
            answer += cnt;

            deleteBlock();
        }

        return answer;
    }

    private static void deleteBlock() {

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
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
        int count = 0;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (map[i][j] == '.') continue;
                checkFourBlock(i, j, visited);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (visited[i][j]) {
                    map[i][j] = '.';
                    count++;
                }
            }
        }

        return count;
    }

    private static void checkFourBlock(int x, int y, boolean[][] visited) {
        char tmp = map[x][y];

        for (int i = x; i < x + 2; i++) {
            for (int j = y; j < y + 2; j++) {
                if (map[i][j] != tmp) return;
            }
        }

        for (int i = x; i < x + 2; i++) {
            for (int j = y; j < y + 2; j++) {
                visited[i][j] = true;
            }
        }

    }

    public static void main(String[] args) {
        String[] str = {
                "CCBDE",
                "AAADE",
                "AAABF",
                "CCBBF"};
        solution(4, 5, str);
    }
}

