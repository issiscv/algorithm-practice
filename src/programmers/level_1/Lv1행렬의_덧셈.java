package programmers.level_1;

public class Lv1행렬의_덧셈 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            int[] a = arr1[i];
            int[] b = arr2[i];

            for (int j = 0; j < a.length; j++) {
                int tmp = a[j] + b[j];
                answer[i][j] = tmp;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        solution(arr1, arr2);
    }

}
