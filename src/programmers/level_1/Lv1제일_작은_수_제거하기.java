package programmers.level_1;


public class Lv1제일_작은_수_제거하기 {

    public static int[] solution(int[] arr) {

        if (arr.length <= 1) {
            return new int[]{-1};
        } else {
            int idx = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    idx = i;
                }
            }

            int[] answer = new int[arr.length - 1];
            int k = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i != idx) {
                    answer[k] = arr[i];
                    k++;
                }
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{10});
        for (int i : solution) {
            System.out.println(i);
        }
    }

}
