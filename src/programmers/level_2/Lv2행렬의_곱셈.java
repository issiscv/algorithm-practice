package programmers.level_2;

public class Lv2행렬의_곱셈 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int row = arr1.length;//3
        int col = arr2[0].length;//2

        answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0;
                for (int k = 0; k < arr2.length; k++) {
                    int a = arr1[i][k];
                    int b = arr2[k][j];
                    sum += (a*b);
                }
                answer[i][j] = sum;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {2, 3, 2},
                {4, 2, 4},
                {3, 1, 4}};

        int[][] arr2 = {
                {5, 4, 3},
                {2, 4, 1},
                {3, 1, 1}};
        solution(arr1, arr2);
    }

}
