package programmers.level_2;

public class Lv2삼각_달팽이 {

    public static int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] map = new int[n][n];

        int x = -1;
        int y = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                map[x][y] = num++;
            }
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) break;
                answer[idx++] = map[i][j];
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(5);
    }

}
