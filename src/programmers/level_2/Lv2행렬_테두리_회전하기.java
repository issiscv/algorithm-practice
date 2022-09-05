package programmers.level_2;

public class Lv2행렬_테두리_회전하기 {


    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] arr = new int[rows+1][columns+1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                arr[i][j] = ((i-1) * columns) + j;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            //2행 2 열
            int min = Integer.MAX_VALUE;

            int x1 = queries[i][0];
            int y1 = queries[i][1];

            //5행 4열
            int x2 = queries[i][2];
            int y2 = queries[i][3];

            int tmp1 = 0;
            int tmp2 = 0;

            //행부터 작업
            int gap1 = y2 - y1;//2
            for (int j = 0; j < gap1; j++) {
                if (j == 0) {
                    tmp1 = arr[x1][y1+gap1];
                    tmp2 = arr[x2][y2-gap1];
                }

                arr[x1][y1+gap1-j] = arr[x1][y1+gap1-j-1];
                arr[x2][y2-gap1+j] = arr[x2][y2-gap1+j+1];
                min = Math.min(min, arr[x1][y1+gap1-j-1]);
                min = Math.min(min, arr[x2][y2-gap1+j+1]);
            }


            //열 작업
            int gap2 = x2 - x1;//3
            for (int j = 0; j < gap2; j++) {
                arr[x1+j][y1] = arr[x1+j+1][y1];
                arr[x2-j][y2] = arr[x2-j-1][y2];
                min = Math.min(min, arr[x1+j+1][y1]);
                min = Math.min(min, arr[x2-j-1][y2]);
            }

            arr[x1+1][y2] = tmp1;
            arr[x2-1][y1] = tmp2;

            min = Math.min(min, tmp1);
            min = Math.min(min, tmp2);

            answer[i] = min;
            //열부터작업
        }


        return answer;
    }


    public static void main(String[] args) {
        int rows = 6;
        int col = 6;

        int[][] queries = {
                {2,2,5,4},
                {3,3,6,6},
                {5,1,6,3}
        };

        int[] solution = solution(rows, col, queries);
        for (int s : solution) {
            System.out.println(s);
        }
    }

}
