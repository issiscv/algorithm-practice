package programmers.level_2;

public class Lv2가장_큰_정사각형_찾기 {

    public static int solution(int [][]board) {
        int answer = 0;

        int[][] map = new int[board.length + 1][board[0].length + 1];

        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if (board[i-1][j-1] != 0) {
                    int min = Math.min(map[i-1][j], Math.min(map[i-1][j-1], map[i][j-1]));
                    map[i][j] = min+1;

                    answer = Math.max(answer, min+1);
                }
            }
        }

        return answer * answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 1, 0},
        };
        int solution = solution(board);
        System.out.println(solution);
    }

}
