package programmers.level_2;

public class LV2쿼드압축_후_개수_세기 {

    private static int[][] map;
    private static int zero = 0;
    private static int one = 0;

    public static int[] solution(int[][] arr) {
        map = new int[arr.length+1][arr[0].length+1];

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr[0].length; j++) {
                map[i][j] = arr[i-1][j-1];
            }
        }

        DFS(1, 1, arr.length);

        return new int[]{zero, one};
    }

    private static void DFS(int row, int col, int n) {

        if (check(row, col, n)) {
            int tmp = map[row][col];
            if (tmp == 0) {
                zero++;
            } else {
                one++;
            }
        } else {
            int size = n / 2;

            for (int i = row; i < row + n; i += size) {
                for (int j = col; j < col + n; j += size) {
                    DFS(i, j, size);
                }
            }
        }
    }

    private static boolean check(int row, int col, int n) {
        int tmp = map[row][col];

        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (tmp != map[i][j]) return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}
        };
        int[] solution = solution(arr);
        for (int i : solution) {
            System.out.println(i);
        }
    }

}
