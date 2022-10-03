package programmers.level_2;

public class Lv2행렬의_곱셈 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        // (3 2) * (2 2)
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
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
